import { Component, OnInit } from '@angular/core';
import { AtmService } from '../../services/atm.service';

@Component({
  selector: 'app-atm-list',
  templateUrl: './atm-list.component.html',
  styleUrls: ['./atm-list.component.css']
})
export class AtmListComponent implements OnInit {

  atms: Array<any>;

  constructor(private atmService: AtmService) { }

  ngOnInit() {

    this.atmService.getAtms().subscribe(
      data => {
        this.atms = data;
      },
      error => console.error(error)
    );
  }

  getAtmsByCity(city: string){

    this.atmService.getAtmsByCity(city).subscribe(
      data => {
        this.atms = data;
      },
      error => console.error(error)
    );
  }

}
