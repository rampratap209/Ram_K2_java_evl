package Q11;

public class Main {
	
	final String name = "ram";
	
	String dep;
	double Salary;

	public Main(String dep, double salary) {
		super();
		this.dep = dep;
		Salary = salary;
	}

	void meth() {
		System.out.println(name);
		System.out.println(dep);
		System.out.println(Salary);
	}

	
	@Override
	public String toString() {
		return "Main [name=" + name + ", dep=" + dep + ", Salary=" + Salary + "]";
	}

	public static void main(String[] args) {
	
	 Main main = new Main("IT", 10000);
	 
	 System.out.println(main);
	}
	
	
	
}
