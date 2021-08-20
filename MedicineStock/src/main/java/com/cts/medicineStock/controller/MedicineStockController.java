package com.cts.medicineStock.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.medicineStock.MedicineStockApplication;
import com.cts.medicineStock.Repository.MedicineStockRepo;
import com.cts.medicineStock.common.RepSchedule;
import com.cts.medicineStock.common.Request;
import com.cts.medicineStock.common.Response;
import com.cts.medicineStock.entitiy.MedicineStock;
import com.cts.medicineStock.services.MedicineStockService;

@RestController
@RequestMapping("/stock")
@CrossOrigin(origins="http://localhost:4200")
public class MedicineStockController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(MedicineStockApplication.class);
	@Autowired
	private MedicineStockService medicineStockService;
	
	@PostMapping("/createStock")
	public ResponseEntity<Response> createOrder(@RequestBody Request request) {
		LOGGER.info("START Create Order");
		Response createStockResponse = medicineStockService.saveOrder(request);
		LOGGER.info("END Create Order");
		return ResponseEntity.status(HttpStatus.CREATED).body(createStockResponse);
		
	}
	@GetMapping("/MedicineStockInformation/{name}")
	public ResponseEntity<List<MedicineStock>> getDetailsByName(@PathVariable String name) {
		LOGGER.info("Start Getting Medicine Stock Information By Name");
		List<MedicineStock> medicineStockByName=medicineStockService.getOrder(name);
		LOGGER.info("End Getting Medicine Stock Information By Name");
		return ResponseEntity.status(HttpStatus.OK).body(medicineStockByName);
	}
	@GetMapping("/MedicineStockInformation/")
	public ResponseEntity<List<MedicineStock>> getDetailsByName() {
		LOGGER.info("Start Getting Medicine Stock Information");
		List<MedicineStock> findAllDetails=medicineStockService.findAll();
		LOGGER.info("End Getting Medicine Stock Information");
		return ResponseEntity.status(HttpStatus.OK).body(findAllDetails);
	}

}
