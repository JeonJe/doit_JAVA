package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new DeskTop();
		Computer c4 = new MyNoteBook();
		
		c1.display();
		c4.display();
//		c4.aaa();  aa�޼ҵ�� Computer �޼ҵ带 ���� ������  ��� �Ұ�
		
	}

}
