package com.cts.MedicalRepresentative.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.MedicalRepresentative.entity.RepSchedule;

@Repository
public interface RepresentativeRepo extends JpaRepository<RepSchedule, Integer>{
	List<RepSchedule> findByDoctorName(String name);
	//List<Representative> findAllDoctorName(String name);
}


