package com.seeds.AspectsLogic;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeAspect {
		
	@Pointcut("execution(public double com.seeds.BusinessLogic.Eplomployees.calculateSalary(double,double))")
	public void m1() {}
	
	@Before("m1()")
	public void Simple() {
		System.out.println("Before Method execution");
	}
	

}
