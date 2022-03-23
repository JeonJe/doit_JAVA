package innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable(final int i ){
		
		final int localNum =100;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
				
			}
		};
		
	}
	
	 
}

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		runnable.run();

	}

}
