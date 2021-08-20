package com.cts.MedicineSupply.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "medicine_supply")
public class MedicineSupply {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pharmacyName;
	private String medicineName;
}
