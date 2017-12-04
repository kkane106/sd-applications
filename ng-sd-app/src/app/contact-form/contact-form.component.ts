import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

import { StudentAppService } from '../student-app.service';

@Component({
  selector: 'app-contact-form',
  templateUrl: './contact-form.component.html',
  styleUrls: ['./contact-form.component.css']
})
export class ContactFormComponent implements OnInit {

  origins = [];

  cohorts = []

  constructor(private applicationService: StudentAppService, private router: Router) { }

  ngOnInit() {
    this.applicationService.getContactFormData()
      .subscribe(
        res => {
          this.origins = res.origins;
          this.cohorts = res.cohorts;
        }
      )
  }

  newContact(form: NgForm): void {
    console.log(form.value);
    this.applicationService.createStudentApplication(form.value)
      .subscribe(
        res => console.log(res),
        err => console.log(err)
      );
    this.router.navigateByUrl('/application/resume');
  }

}
