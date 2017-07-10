import { Injectable } from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Observable'
import 'rxjs/add/operator/map';
@Injectable()
export class AtmService {

  constructor(private http: Http) { }
    getAtms(): Observable<any>{
      return this.http.get('http://localhost:8080/')
        .map((response: Response) => response.json());
    }

    getAtmsByCity(city: string): Observable<any>{
      return this.http.get(`http://localhost:8080/atms?city=${city}`)
        .map((response: Response) => response.json());
    }
}
