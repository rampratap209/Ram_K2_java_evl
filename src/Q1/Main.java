package Q1;

class Emp{
	
	String name ;
	int Id ;
	double Salary ;
	String Department;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", Id=" + Id + ", Salary=" + Salary + ", Department=" + Department + "]";
	}
	

	void displayInfo() {
		System.out.println(name);
		System.out.println(Id);
		System.out.println(Salary);
		System.out.println(Department);
	}


	public Emp(String name, int id, double salary, String department) {
		super();
		this.name = name;
		Id = id;
		Salary = salary;
		Department = department;
	}

}



public class Main {

	public static void main(String[] args) {
		
		
		
		Emp emp =new Emp("ram", 10, 10000, "IT");
		
		System.out.println(emp.name);
		System.out.println(emp.Id);
		System.out.println(emp.Salary);
		System.out.println(emp.Department);
		
		
		
		System.out.println(emp);
		
	}
}
