package interfaceex;

public class Myclass implements MyInteface {

	@Override
	public void y() {
		System.out.println("Y()");
		
	}

	@Override
	public void x() {
		System.out.println("x()");
		
	}
	
	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
	
	public static void main(String[] args) {
		
		Myclass myClass = new Myclass();
		
		X xClass = myClass;
		xClass.x();
		
		Y yClass = myClass;
		yClass.y();
		
		MyInteface iClass = myClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		
		
	}
	
	

}
