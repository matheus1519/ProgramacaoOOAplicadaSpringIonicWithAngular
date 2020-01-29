import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./tabs/tabs.module').then(m => m.TabsPageModule)
  },
  {
    path: 'carros',
    loadChildren: () => import('./pages/carros/carros.module').then( m => m.CarrosPageModule)
  },
  {
    path: 'form-carros',
    loadChildren: () => import('./pages/form-carros/form-carros.module').then( m => m.FormCarrosPageModule)
  },
  { path: 'form-carros/:id',
    loadChildren: () => import('./pages/form-carros/form-carros.module').then( m => m.FormCarrosPageModule)
  }
];
@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
