package com.backbase.atm.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.core.Pollers;
import org.springframework.integration.dsl.http.Http;
import org.springframework.integration.dsl.support.Transformers;
import org.springframework.integration.scheduling.PollerMetadata;
import org.springframework.messaging.MessageChannel;

import com.backbase.atm.model.Atm;



@IntegrationComponentScan
@Configuration
@EnableIntegration
@ComponentScan
public class InfrastructorConfig {
	
	@Bean
	public MessageChannel requestChannel() {
	    return new DirectChannel() ;
	}
	
	@Bean(name = PollerMetadata.DEFAULT_POLLER)
	public PollerMetadata poller() {
		return Pollers.fixedRate(500).get();
	}
	
	@Bean
	public IntegrationFlow httpPostAtms() {
		
		return IntegrationFlows.from("requestChannel")
	            .handle(Http.outboundGateway("https://www.ing.nl/api/locator/atms/")
	            		.httpMethod(HttpMethod.GET)
	            		.expectedResponseType(String.class))
	            .<String, String>transform(p -> p.substring(5))
	            .transform(Transformers.fromJson(Atm[].class))
	            .get();
		
	}

}
