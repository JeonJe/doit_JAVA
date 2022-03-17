package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new DeskTop();
		Computer c4 = new MyNoteBook();
		
		c1.display();
		c4.display();
//		c4.aaa();  aa메소드는 Computer 메소드를 보기 때문에  사용 불가
		
	}

}
