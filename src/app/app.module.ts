import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import {HttpModule} from '@angular/http';
import { AlertModule } from 'ngx-bootstrap/alert';

import { AppComponent } from './app.component';
import { AtmService } from './services/atm.service';
import { AtmListComponent } from './components/atm-list/atm-list.component';

@NgModule({
  declarations: [
    AppComponent,
    AtmListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AlertModule.forRoot()
  ],
  providers: [AtmService],
  bootstrap: [AppComponent]
})
export class AppModule { }
