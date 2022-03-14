package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
		//year = year 는 지역변수에 assign
	}
	public void printThis() {
		System.out.println(this);
	}
}
public class ThisEx {

	public static void main(String[] args) {
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		b1.printThis();
		b2.printThis();
	}

}
