package com.cts.MedicineSupply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MedicineSupply.entity.MedicineSupply;
import com.cts.MedicineSupply.service.MedicineSupplyService;

@RestController
@RequestMapping("/supply")
@CrossOrigin(origins="http://localhost:4200")
public class MedicineSupplyController {
	@Autowired
	private MedicineSupplyService medicineSupplyService;
	@GetMapping("/SupplyAvailed/{name}")
	public ResponseEntity<List<MedicineSupply>> getDetailsByName(@PathVariable String name) {
		return ResponseEntity.status(HttpStatus.OK).body(medicineSupplyService.getOrder(name));
	}
	@GetMapping("/SupplyAvailed")
	public ResponseEntity<List<MedicineSupply>> getDetailsByName() {
		return ResponseEntity.status(HttpStatus.OK).body(medicineSupplyService.findAll());
	}
}
