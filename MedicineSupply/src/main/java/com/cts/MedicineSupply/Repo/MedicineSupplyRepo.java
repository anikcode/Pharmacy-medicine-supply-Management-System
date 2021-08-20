package com.cts.MedicineSupply.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.MedicineSupply.entity.MedicineSupply;

public interface MedicineSupplyRepo extends JpaRepository<MedicineSupply, Integer> {
	List<MedicineSupply> findByMedicineName(String name);
}
