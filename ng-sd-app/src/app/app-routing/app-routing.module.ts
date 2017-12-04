import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContactFormComponent } from '../contact-form/contact-form.component';
import { WelcomeComponent } from '../welcome/welcome.component';
import { ResumeComponent } from '../resume/resume.component';

const routes: Routes = [
  {
    path: '',
    component : WelcomeComponent,
    pathMatch: 'full',
    children: []
  },
  {
    path: 'application/contact',
    component : ContactFormComponent,
    children: []
  },
  {
    path: 'application/resume',
    component : ResumeComponent,
    children: []
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
