import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

interface EmployeeWage {

	void addCompanyEmpWage(String company ,int wagePerHour,int workingDays,int workingHours);
	void computeEmpWage();
}

public class EmployeeWageComputation implements EmployeeWage {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private ArrayList<CompanyEmpWage> companies;
	private Map<String,Integer> companyWages;

	public EmployeeWageComputation() {
		companies = new ArrayList<CompanyEmpWage>();
		companyWages = new HashMap<String,Integer>();
	}

	public void addCompanyEmpWage(String company ,int wagePerHour,int workingDays,int workingHours){
		companies.add(new CompanyEmpWage(company,wagePerHour,workingDays,workingHours));
	}

	public void computeEmpWage() {
		for(int i = 0; i<companies.size(); i++) {
                     CompanyEmpWage company = companies.get(i);
                     int totalWage = computeEmpWage(company);
                     company.setTotalEmpWage(totalWage);
                     companyWages.put(company.getName(),totalWage);
                }
		System.out.println("Sorted values in Map --->" +companyWages.toString());
	}
	//Calculating monthly wage of employee
	private int computeEmpWage(CompanyEmpWage companyEmpWage){
		//variables
		int empHours=0, totalWorkingDays=0, totalEmpHours=0;
		while (totalEmpHours <= companyEmpWage.workingHours && totalWorkingDays < companyEmpWage.workingDays){
                        totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck){
				case IS_PART_TIME:
					empHours=8;
					break;
				case IS_FULL_TIME:
					empHours=4;
					break;
				default:
					empHours=0;
			}
			totalEmpHours += empHours;
		}
		System.out.println("total employee working hour - "+totalEmpHours);
        	System.out.println("total employee working days - "+totalWorkingDays);
        	return totalEmpHours * companyEmpWage.wagePerHour;
	}
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		EmployeeWageComputation empWage = new EmployeeWageComputation();
		empWage.addCompanyEmpWage("Dmart",20,20,100);
		empWage.addCompanyEmpWage("Reliance",10,25,150);
		empWage.computeEmpWage();
	}
}
