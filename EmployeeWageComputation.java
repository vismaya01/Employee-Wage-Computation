import java.util.Scanner;
public class EmployeeWageComputation {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	//Calculating monthly wage of employee
	public static void employeeMonthlyWage(int wagePerHour,int workingDays,int workingHours){
		//variables
		int empHours=0;
		int totalWorkingDays=0, totalEmpHours=0;
		int empCheck=(int) Math.floor(Math.random() * 10) % 3;
		while (totalEmpHours <= workingHours && totalWorkingDays < workingDays){
                        totalWorkingDays++;
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
        int totalEmpWage = totalEmpHours * wagePerHour;
        System.out.println("Total employee wage - "+totalEmpWage);
	}

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		//take user input for each company
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the wage per hour");
		int wagePerHour=sc.nextInt();
		System.out.println("enter the number of working days");
		int numWorkingDays=sc.nextInt();
		System.out.println("enter the number of working hour");
		int numWorkingHours=sc.nextInt();
		employeeMonthlyWage(wagePerHour,numWorkingDays,numWorkingHours);
	}
}
