package Q14;

class Emp{
	
	void calsal(double Salary) {
		System.out.println(Salary);
	}
	
	void calsal(double Salary, double Bonus) {
		System.out.println(Salary + Bonus);
	}
	
	void calsal(double Salary, double Bonus, double Tax) {
		System.out.println(Salary + Bonus - Tax);
	}
}


class Emp2 extends Emp{
	@Override
	void calsal(double Salary) {
		System.out.println(Salary);
	}
	@Override
	void calsal(double Salary, double Bonus) {
		System.out.println(Salary + Bonus);
	}
	@Override
	void calsal(double Salary, double Bonus, double Tax) {
		System.out.println(Salary + Bonus - Tax);
	}
	
}


public class Main {

	
	public static void main(String[] args) {
		
		System.out.println("Method Overloading");
		Emp emp = new Emp();
		emp.calsal(10000);
		emp.calsal(20000, 1000);
		emp.calsal(30000, 2000, 500);
		
		System.out.println("Method OverRidding");
		Emp2 emp2 = new Emp2();
		emp2.calsal(111111);
		emp2.calsal(22222, 33);
		emp2.calsal(33333, 22, 11);
		
	}
}
