public class EmployeeWageComputation {
	public static void attendanceCheck(){
		int empCheck=(int) Math.floor(Math.random() * 10) % 2;
		if(empCheck==1){
			System.out.println("Employee is Present");
		}
		else{
			System.out.println("Employee is Absent");
		}
	}
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		attendanceCheck();
	}
}
