package practice;

public class MyDateTest {

	public static void main(String[] args) {
	
		MyDate date1 = new MyDate(30,2,200);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2,10,200);
		System.out.println(date2.isValid());
		
	}

}
