package innerclass;


class OutClass{
	
	int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	
	public OutClass(){
		inClass = new InClass();	
	}
	
	private class InClass{
		int inNum = 200;
//		static int sInNum = 100;
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			
		}
	}
	
	public void usingInTest() {
		inClass.inTest();	
	}
	
	static class InstaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			num+=10;
			sNum +=10;
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			System.out.println(sInNum);
		}
	}
	
}
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		OutClass outClass = new OutClass();
//		outClass.usingInTest();
		
//		OutClass.InstaticClass sInstaticClass = new OutClass().InstaticClass();
//		sInstaticClass.inTest();
		OutClass.InstaticClass.sTest();

	}

}
