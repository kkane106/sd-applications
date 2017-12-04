import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from "@angular/http";
import { FormsModule } from "@angular/forms";

import { AppRoutingModule} from './app-routing/app-routing.module';

import { AppComponent } from './app.component';
import { ContactFormComponent } from './contact-form/contact-form.component';
import { ResumeComponent } from './resume/resume.component';

import { FileUploadService } from './file-upload.service';
import { StudentAppService } from './student-app.service';
import { WelcomeComponent } from './welcome/welcome.component';

@NgModule({
  declarations: [
    AppComponent,
    ContactFormComponent,
    ResumeComponent,
    WelcomeComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [
    FileUploadService,
    StudentAppService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
