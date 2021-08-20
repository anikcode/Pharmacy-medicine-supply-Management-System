package com.cts.MedicineSupply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.MedicineSupply.Repo.MedicineSupplyRepo;
import com.cts.MedicineSupply.entity.MedicineSupply;

@Service
public class MedicineSupplyService {
	@Autowired
	private MedicineSupplyRepo medicineSupplyRepo;
	public List<MedicineSupply> getOrder(String name){
		return medicineSupplyRepo.findByMedicineName(name);
	}
	public List<MedicineSupply> findAll(){
		return medicineSupplyRepo.findAll();
	}
}


