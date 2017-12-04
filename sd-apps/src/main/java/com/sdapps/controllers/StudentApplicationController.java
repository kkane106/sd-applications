package com.sdapps.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdapps.helpers.ApplicationDTO;
import com.sdapps.repositories.CohortRepository;
import com.sdapps.repositories.OriginRepository;
import com.sdapps.services.StudentApplicationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentApplicationController {
	
	private OriginRepository originRepo;
	private CohortRepository cohortRepo;
	private StudentApplicationService appService;
	
	public StudentApplicationController(OriginRepository originRepo, CohortRepository cohortRepo, StudentApplicationService appService) {
		this.originRepo = originRepo;
		this.cohortRepo = cohortRepo;
		this.appService = appService;
	}

	@GetMapping("/data/application/contactform")
	public ResponseEntity getFormData() {
		Map<String, Object> resMap = new HashMap<>();
		resMap.put("origins", originRepo.findAll());
		resMap.put("cohorts", cohortRepo.findUpcomingCohorts());
		return new ResponseEntity(resMap, null, HttpStatus.OK);
	}
	
	@PostMapping("data/studentApplication")
	public ResponseEntity createStudentApplication(@RequestBody ApplicationDTO application) {
		ObjectMapper om = new ObjectMapper();
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		StudentApplication app = appService.createStudentApplication(application);
		System.out.println(application);
		return new ResponseEntity<>(null, null, HttpStatus.OK);	
	}
}