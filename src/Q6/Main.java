package Q6;

public class Main {

	static void S_meth() {
		System.out.println("Static Method");
	}
	
	void N_meth() {
		System.out.println("Non Static Method");
	}
	
	public void G_meth() {
		System.out.println("Global Method");
	}
	
	double salary() {
		
		System.out.println("local Method");
		return salary();
	}
	
	public static void main(String[] args) {
	    S_meth();
	    
	    Main main =new Main();
	    main.N_meth();
	    
	    main.G_meth();
	    
	    
	    
	
	}
}
