package Q9;

class Emp{
	
	double calsal( double salary) {
		
		return  salary;
	}
	
	
}

class Emp2 extends Emp{
    
	@Override
	double calsal(double salary) {
		
		System.out.println(salary);
		return super.calsal(salary);
	}	
	
}


public class Main {

	public static void main(String[] args) {
		
		Emp2 emp2 = new Emp2();
		emp2.calsal(20000);
		
		
	}
}
