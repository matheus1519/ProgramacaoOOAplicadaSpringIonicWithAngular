import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { FormCarrosPageRoutingModule } from './form-carros-routing.module';

import { FormCarrosPage } from './form-carros.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    FormCarrosPageRoutingModule
  ],
  declarations: [FormCarrosPage]
})
export class FormCarrosPageModule {}
