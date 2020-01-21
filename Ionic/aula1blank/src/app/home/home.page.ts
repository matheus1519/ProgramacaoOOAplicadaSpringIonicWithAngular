import { Component } from '@angular/core';
import { AlertController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  base:number;
  altura:number;

  constructor(public alertController:AlertController) {}
  async mostraAlerta(){
    const alerta = await this.alertController.create({
      header: "Total da Área",
      subHeader: `O total da área é: ${(this.base * this.altura) / 2}`,
      buttons:["Ok"]
    });
    alerta.present();
  }
}
