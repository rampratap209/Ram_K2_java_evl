package Q2;

class Emp{
	
	public String pub_name = "public";
	private String pvt_name = "pvt";
	protected String protected_name = "protected";
	String def_naame = "defalut";
	
	
}



public class Main {

	
	public static void main(String[] args) {
		Emp emp =new Emp();
		
		System.out.println(emp.pub_name);
		System.out.println(emp.def_naame);
		System.out.println(emp.protected_name);
		System.out.println("private Is private Can Not Call in Another Class");
		
	}
}
