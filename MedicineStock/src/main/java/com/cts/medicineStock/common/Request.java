package com.cts.medicineStock.common;

import com.cts.medicineStock.entitiy.MedicineStock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Request {
	private MedicineStock medicineStock;
	private RepSchedule repSchedule;
}
