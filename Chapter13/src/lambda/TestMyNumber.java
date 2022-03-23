package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		MyNumber maxNum = (x,y) -> (x >= y) ? x : y;
		int max = maxNum.getMxNumber(10, 20);
		System.out.println(max);
	}

}
