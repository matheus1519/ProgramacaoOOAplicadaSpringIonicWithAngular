import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { TrianguloPageRoutingModule } from './triangulo-routing.module';

import { TrianguloPage } from './triangulo.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    TrianguloPageRoutingModule
  ],
  declarations: [TrianguloPage]
})
export class TrianguloPageModule {}
