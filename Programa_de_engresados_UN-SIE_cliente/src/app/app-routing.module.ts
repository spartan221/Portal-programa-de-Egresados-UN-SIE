import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormularioComponent } from './formulario/formulario.component';
import { HomeComponent } from './home/home.component';
import { VistaAdministradorComponent } from './vista-administrador/vista-administrador.component';

// Definicion de las rutas de las paginas web
const routes: Routes = [
  
  {
    path: 'publicaciones',
    component: VistaAdministradorComponent,
  },
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'formulario',
    component: FormularioComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }