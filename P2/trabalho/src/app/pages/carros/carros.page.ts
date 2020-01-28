import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Carro } from 'src/app/models/carros';
import { ApiCarrosService } from 'src/app/service/api-carros.service';
import { Observable } from 'rxjs';
@Component({
 selector: 'app-carros',
 templateUrl: './carros.page.html',
 styleUrls: ['./carros.page.scss'],
})
export class CarrosPage implements OnInit {

  ngOnInit(): void {
    throw new Error("Method not implemented.");
  }

  carros: Observable<any>;
  carro: Carro;

  constructor(private router: Router, private api:ApiCarrosService ) {
    this.getAll();
  }
  async getAll() {
    this.carros = this.api.getAll();
  }
  addCarro(){
    this.router.navigate(['form-carros', 0]);
  }
  editCarro(id: number) {
    this.router.navigate(['form-carros', id]);
  }
  removeCarro(id: number){
    this.api.delete(id).subscribe(data => { this.getAll() });
  }
}