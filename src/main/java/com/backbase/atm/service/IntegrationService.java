package com.backbase.atm.service;

import java.util.List;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.handler.annotation.Payload;

import com.backbase.atm.model.Atm;

@MessagingGateway
public interface IntegrationService {

	@Gateway(requestChannel = "requestChannel")
	@Payload("'string'")
	List<Atm> getAllAtms();
}
