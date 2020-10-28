public class EmployeeWageComputation {
	//constants
	public static final int IS_EMP_PRESENT = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	//Calculating daily wage of employee 
	public static void employeeDailyWage(){
		//variables
		int empHours=0, dailyWage=0;
		int empCheck=(int) Math.floor(Math.random() * 10) % 2;
		if(empCheck==IS_EMP_PRESENT){
			empHours=8;
			System.out.println("Employee is Present");
		}
		else{
			System.out.println("Employee is Absent");
		}
		dailyWage=empHours*EMP_RATE_PER_HOUR;
		System.out.println("Employee daily wage - "+dailyWage);
	}
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		employeeDailyWage();
	}
}
