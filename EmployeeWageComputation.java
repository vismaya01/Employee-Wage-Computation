public class EmployeeWageComputation {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
	//Calculating monthly wage of employee
	public static void employeeMonthlyWage(){
		//variables
		int empHours=0;
		int totalWorkingDays=0, totalEmpHours=0;
		int empCheck=(int) Math.floor(Math.random() * 10) % 3;
		while (totalEmpHours <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
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
        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;
        System.out.println("Total employee wage - "+totalEmpWage);
	}

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		employeeMonthlyWage();
	}
}
