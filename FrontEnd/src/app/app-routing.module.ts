import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { NewExperienciaComponent } from './component/experiencia/new-experiencia.component';
import { EditExperienciaComponent } from './component/experiencia/edit-experiencia/edit-experiencia.component';
import { NeweducacionComponent } from './component/educacion/neweducacion.component';
import { EditeducacionComponent } from './component/educacion/editeducacion.component';

const routes: Routes = [
  {path:'', component: HomeComponent},
  {path:'login', component:LoginComponent},
  {path:'nuevaexp', component: NewExperienciaComponent},
  {path:'editExp/:id', component: EditExperienciaComponent},
  {path:'nuevaedu', component: NeweducacionComponent},
  {path:'editedu/:id', component: EditeducacionComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
