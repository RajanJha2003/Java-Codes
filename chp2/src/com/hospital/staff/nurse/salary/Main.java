package com.hospital.staff.nurse.salary;

class NurseSalary extends com.hospital.staff.doctor.salary.Salary{
	
	@Override
	protected double calculateSalary(double amt, double tax) {
		// TODO Auto-generated method stub
		return super.calculateSalary(amt, tax);
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		NurseSalary nurseSalary=new NurseSalary();
		System.out.println(nurseSalary.calculateSalary(1000, 200));
	}

}
