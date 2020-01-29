import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { TabsPage } from "./tabs.page";

const routes: Routes = [
  {
    path: "tabs",
    component: TabsPage,
    children: [
      {
        path: "carros",
        children: [
          {
            path: "",
            loadChildren: () =>
              import("../pages/carros/carros.module").then(
                m => m.CarrosPageModule
              )
          }
        ]
      },
      {
        path: "form-carros",
        children: [
          {
            path: "",
            loadChildren: () =>
              import("../pages/form-carros/form-carros.module").then(
                m => m.FormCarrosPageModule
              )
          }
        ]
      },
      {
        path: "tab3",
        children: [
          {
            path: "",
            loadChildren: () =>
              import("../tab3/tab3.module").then(m => m.Tab3PageModule)
          }
        ]
      },
      {
        path: "",
        redirectTo: "/tabs/tab1",
        pathMatch: "full"
      }
    ]
  },
  {
    path: "",
    redirectTo: "/tabs/tab1",
    pathMatch: "full"
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TabsPageRoutingModule {}
