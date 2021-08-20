package com.cts.MedicalRepresentative.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.MedicalRepresentative.entity.RepSchedule;
import com.cts.MedicalRepresentative.repository.RepresentativeRepo;

@Service
public class RepresentativeService {
	@Autowired
	private RepresentativeRepo representativeRepo; 
	public RepSchedule saveDetails(RepSchedule representative) {
		return representativeRepo.save(representative);
	}
	
	public List<RepSchedule>getDetailsByName(String name){
		return representativeRepo.findByDoctorName(name);
	}
	private static List<RepSchedule> schedule = new ArrayList<>();
	
	static {
		schedule.add(new RepSchedule(1,"R1" , "D1" , "Orthopaedics", "Orthoherb,Cholecalciferol","1 PM to 2 PM",new Date(),"987654321"));
		schedule.add(new RepSchedule(2,"R2" , "D2" , "General", "Gaviscon, Dolo-650","1 PM to 2 PM",new Date(),"987654321"));
		schedule.add(new RepSchedule(3,"R3" , "D3" , "General", "Gaviscon, Dolo-650","2 PM to 3 PM",new Date(),"987654321"));
		schedule.add(new RepSchedule(4,"R1" , "D4" , "Orthopaedics", "Orthoherb, Cholecalciferol","2 PM to 3 PM",new Date(),"987654321"));
		schedule.add(new RepSchedule(5,"R2" , "D5" , "Gynaecology", "Cyclopam, Hilact","1 PM to 2 PM",new Date(),"987654321"));	
	}
	public List<RepSchedule> findAll() {
		return schedule;
	}
}
