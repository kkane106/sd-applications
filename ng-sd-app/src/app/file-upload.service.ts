import { Injectable } from '@angular/core';

import { Http, Headers, Response, Request, RequestMethod, URLSearchParams, RequestOptions } from "@angular/http";
import {Observable} from 'rxjs/Rx';

@Injectable()
export class FileUploadService {

  constructor(private http: Http) { }

  uploadFile(file: File): any {

    let formData:FormData = new FormData();
    formData.append('uploadFile', file, file.name);
    let headers = new Headers();
    headers.append('Accept', 'application/json');
    let options = new RequestOptions({ headers: headers });

    return this.http.post(
              'http://localhost:8080/file/upload',
              formData,
              options)
                .catch(error => Observable.throw(error)
            );
  }

}
