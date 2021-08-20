package com.cts.medicineStock.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.medicineStock.Repository.MedicineStockRepo;
import com.cts.medicineStock.common.RepSchedule;
import com.cts.medicineStock.common.Request;
import com.cts.medicineStock.common.Response;
import com.cts.medicineStock.entitiy.MedicineStock;

@Service
public class MedicineStockService {
	@Autowired
	private MedicineStockRepo medicineStockRepo;
	@Autowired
	private RestTemplate template;
	public Response saveOrder( Request request) {
		MedicineStock medicineStock=request.getMedicineStock();
		RepSchedule repSchedule=request.getRepSchedule();
		repSchedule.setAilment(medicineStock.getTargetAilment());
		repSchedule.setMedicine(medicineStock.getName());
		RepSchedule response=template.postForObject("http://localhost:8081/rep/createDetails", repSchedule, RepSchedule.class);
		medicineStockRepo.save( medicineStock);
		return new Response(medicineStock);
	}
	public List<MedicineStock> getOrder(String name){
		return medicineStockRepo.findByName(name);
	}
	public List<MedicineStock> findAll(){
		return medicineStockRepo.findAll();
	}

}
