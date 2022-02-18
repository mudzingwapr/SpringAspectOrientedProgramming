package com.seeds.BusinessLogic;


import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Eplomployees {
	private Integer eid;
	private String ename;
	private String esurname;

	public Double calculateSalary(double amount,double rate ) {
		Double totalAmount = amount*rate;
		log.info("The Salary of employee is being Calculated");
		return totalAmount;
	}
	
	 public void SaveSalaryInDab(Eplomployees emp) {
		 System.out.println(emp.eid +":"+ emp.ename+":"+emp.esurname);
		 System.out.println("Doubled");
		 System.out.println("=============================================================");
	 }

}
