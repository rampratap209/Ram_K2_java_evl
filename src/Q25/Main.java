package Q25;

public class Main {

	int a  = 10;
	int b = 00;
	
	void meth() throws ArithmeticException{
		
		System.out.println(a/b);	
	}
	
	void meth2() throws ArithmeticException{
		System.out.println();
	}
	
	public static void main(String[] args) {
	
	
		Main main =  new Main();
		try {
		 main.meth();
		}catch (ArithmeticException E) {
			System.out.println(E);
		}catch (ArrayStoreException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	
	}
}
