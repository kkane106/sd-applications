import { Injectable } from '@angular/core';
import { Http, Headers, Response, Request, RequestMethod, URLSearchParams, RequestOptions } from "@angular/http";
import {Observable} from 'rxjs/Rx';

import {FileUploadService} from './file-upload.service';

@Injectable()
export class StudentAppService {
  constructor(private http: Http, private uploader: FileUploadService) {}

  setApplicationIntake(info) {
  }

  setResume(file: File) {
    this.uploader.uploadFile(file)
      .subscribe(
        res => console.log(res),
        err => console.log(err)
      )
  }

  getContactFormData() {
    return this.http.get('http://localhost:8080/data/application/contactform')
              .map(res => res.json());
  }

  createStudentApplication(applicationData) {
    let application: any = {};
    application.student = {
      firstName : applicationData.firstName,
      lastName : applicationData.lastName,
      contact : {
        phone : applicationData.phone,
        email : applicationData.email
      },
      addresses : [{
        city : applicationData.city,
        state : applicationData.state
      }]
    };

    application.origin = {
      name : applicationData.origin
    }

    application.cohort = applicationData.cohort;

    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });

    console.log(application)
    return this.http.post('http://localhost:8080/data/studentApplication', applicationData, options)
              .map(res => res.json());
  }

}
