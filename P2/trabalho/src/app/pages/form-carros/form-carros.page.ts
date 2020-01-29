import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Carro } from 'src/app/models/carros';
import { ApiCarrosService } from 'src/app/service/api-carros.service';

@Component({
 selector: 'app-form-carros',
 templateUrl: './form-carros.page.html',
 styleUrls: ['./form-carros.page.scss'],
})
export class FormCarrosPage implements OnInit {
  carro : Carro;
  id: number = 0;
  constructor(private actRoute: ActivatedRoute, private router: Router,private api:ApiCarrosService) {
    this.carro = new Carro();
  }

  save(){
    if (this.id==0) {
      this.api.create(this.carro).subscribe(data => {this.ionViewWillEnter()});
    }
    else {
      this.api.update(this.id,this.carro).subscribe(data => {this.ionViewWillEnter()});
    }
    this.router.navigateByUrl('/carros');
  }

  ngOnInit() {}

  ionViewWillEnter(){
    this.actRoute.params.subscribe(params => {
      this.id = params['id'];
      console.log('Valor do Carro id: '+this.id);
    });
    if (this.id!=0) {
      this.api.get(this.id).subscribe(resultado => {
        this.carro = resultado;
      });
    }
  }
}