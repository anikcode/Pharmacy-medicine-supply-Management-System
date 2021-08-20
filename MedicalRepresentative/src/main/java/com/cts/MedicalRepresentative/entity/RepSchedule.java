package com.cts.MedicalRepresentative.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString

public class RepSchedule {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String representativeName;
	private String doctorName;
	private String ailment;
	private String medicine;
	private String meetingSlot;
	private Date date;
	private String number;
	public RepSchedule(int id,String name2, String doc, String treating, List<String> med, String time,
			Date date, String number2) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.representativeName=name2;
		this.doctorName=doc;
		ailment=treating;
		for(String m:med) {
			if(medicine==null) {
				medicine=m;
			}
			else {
				medicine+=", "+m;
			}
		}
		meetingSlot=time;
		//this.date=datetostr(date);
		number=number2;
	}
	public static String datetostr(Date date)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
	    return formatter.format(date);  
	}
	public RepSchedule(String name2, String doc, String treating, String med, String time,
			Date date, String number2) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.representativeName=name2;
		this.doctorName=doc;
		ailment=treating;
		medicine=med;
		meetingSlot=time;
		number=number2;
	}
	
}
