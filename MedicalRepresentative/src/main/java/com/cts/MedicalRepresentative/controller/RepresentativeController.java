package com.cts.MedicalRepresentative.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MedicalRepresentative.entity.RepSchedule;
import com.cts.MedicalRepresentative.service.RepresentativeService;


@RestController
@RequestMapping("/rep")
@CrossOrigin(origins="http://localhost:4200")
public class RepresentativeController {
	@Autowired
	private RepresentativeService representativeService;
	
	@PostMapping("/createDetails")
	public ResponseEntity<RepSchedule> createOrder(@RequestBody RepSchedule representative) {
		return ResponseEntity.status(HttpStatus.CREATED).body(representativeService.saveDetails(representative));
	}
	
//	@GetMapping("/RepSchedule{name}")
//	public ResponseEntity<List<RepSchedule>> getDetailsByName(@PathVariable String name) {
//		return ResponseEntity.status(HttpStatus.OK).body(representativeService.getDetailsByName(name));
//	}
	
	@GetMapping("/RepSchedule/{date}")
	public ResponseEntity<List<RepSchedule>> getDetailsByName(@PathVariable String date) {
		return ResponseEntity.status(HttpStatus.OK).body(representativeService.findAll());
	}
}