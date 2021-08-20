package com.cts.medicineStock.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.medicineStock.entitiy.MedicineStock;

public interface MedicineStockRepo extends JpaRepository<MedicineStock, Integer>  {
	List<MedicineStock> findByName(String name);
}
