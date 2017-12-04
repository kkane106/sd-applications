import { Component, OnInit } from '@angular/core';

import {FileUploadService} from '../file-upload.service';
import { StudentAppService } from '../student-app.service';


@Component({
  selector: 'app-resume',
  templateUrl: './resume.component.html',
  styleUrls: ['./resume.component.css']
})
export class ResumeComponent implements OnInit {

  constructor(private fileUploader: FileUploadService, private applicationService: StudentAppService) { }

  ngOnInit() {
  }

  fileChange(event) {
    let fileList: FileList = event.target.files;
    if(fileList.length > 0) {
      this.applicationService.setResume(fileList[0]);
    }
  }

  submitApplication() {
    // this.applicationService.submitApplication()
    //   .subscribe(
    //     res => console.log(res),
    //     err => console.log(err)
    //   )
  }
/*
  fileChange(event) {
    let fileList: FileList = event.target.files;
    if(fileList.length > 0) {
      let file: File = fileList[0];
      this.fileUploader.uploadFile(file)
        .subscribe(
          data => console.log('success'),
          error => console.log(error)
        );
    }
  }
*/
}
