package com.cts.medicineStock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.medicineStock.Repository.MedicineStockRepo;
import com.cts.medicineStock.entitiy.MedicineStock;
import com.cts.medicineStock.services.MedicineStockService;

@RunWith(SpringRunner.class)
@SpringBootTest
class MedicineStockApplicationTests {

	@Autowired
	private MedicineStockService medicineStockService;
	
	@MockBean
	private MedicineStockRepo medicineStockRepo;
	@Test
	public void findAllTest() {
		when(medicineStockRepo.findAll()).thenReturn(Stream.of(new MedicineStock(1,"Orthoherb","Eranda","Orthopaedics",new Date(),8000),new MedicineStock(1,"Orthoherb","Phar","Orthopaedics",new Date(),7000)).collect(Collectors.toList()));
		assertEquals(2,medicineStockService.findAll().size());
	}
	@Test
	public void getOrderTest() {
		String name="Aniket";
		when(medicineStockRepo.findByName(name)).thenReturn(Stream.of(new MedicineStock(1,"Orthoherb","Eranda","Orthopaedics",new Date(),8000)).collect(Collectors.toList()));
		assertEquals(1,medicineStockService.getOrder(name).size());
	}
}
