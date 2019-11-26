import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { TrianguloPage } from './triangulo.page';

const routes: Routes = [
  {
    path: '',
    component: TrianguloPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class TrianguloPageRoutingModule {}
