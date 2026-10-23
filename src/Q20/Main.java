package Q20;

class Cls_1 {
	
	void meth() {
		
		System.out.println("SINGLE");
	}
	
}


class Cls2 extends Cls_1{
	
	@Override
	void meth() {
		System.out.println("MULTILEVEL");
	}
}

class Cls3 extends Cls2{
	
	@Override
	void meth() {
		System.out.println("HERACHICAL");
	}
}

public class Main  {

	
	public static void main(String[] args) {
		
		Cls_1 cls_1 =new Cls_1();
		cls_1.meth();
		
		Cls2 cls2 = new Cls2();
		cls2.meth();
		
		Cls3 cls3 = new Cls3();
		cls3.meth();
		
	
	}
}
