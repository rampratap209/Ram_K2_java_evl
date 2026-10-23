package Q10;

class Outer {
	
	class Inner{
		void meth() {
			System.out.println("method");
		}
	}
	
	
}

public class Main  {

	public static void main(String[] args) {
		
		Outer.Inner inner = new Outer.Inner();
		inner.meth();
		
	}
}
