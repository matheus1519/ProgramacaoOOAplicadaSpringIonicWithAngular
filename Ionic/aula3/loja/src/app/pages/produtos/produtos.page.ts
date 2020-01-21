import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
// import { EditProdutoPage } from './produtos.page';
import { Produto } from '../../models/produtos';
@Component({
  selector: 'app-produtos',
  templateUrl: './produtos.page.html',
  styleUrls: ['./produtos.page.scss'],
})
export class ProdutosPage implements OnInit {
  produtos: any;
  produto: Produto;

  constructor(private router: Router) {
      this.getProdutos();
  }

  getProdutos() {
    this.produtos = [{"id":6,"nome":"Ricardo","qtde":109},{"id":13,"nome":"Fernanda","qtde":8}];
  }
  ngOnInit() {
  }
  addProduto(){
    this.router.navigate(['/edit-produto', 0]);
  }
  editProduto(id: number) {
    this.router.navigate(['/edit-produto', id]);
  }
  removeProduto(id: number){
    // this.api.delete(id);
    // this.getAll();
  }
}
