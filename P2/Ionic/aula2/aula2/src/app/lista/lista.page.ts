import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.page.html',
  styleUrls: ['./lista.page.scss'],
})
export class ListaPage implements OnInit {
  alunos: any = [{nome:'Matheus', nota: 3}];
  
  nome: string = "";
  nota:number;
  
  save() {
    this.alunos.push({nome:this.nome, nota:this.nota});
    this.nome = '';
    this.nota = null;
  }
  
  remove(i){
    this.alunos.splice(i,1);
  }

  constructor() { }

  ngOnInit() {
  }

}
