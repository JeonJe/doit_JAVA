package interfaceex;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("�Ǵ�");
		
		
	}

	@Override
	public void Buy() {
		System.out.println("���");
		
	}

	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}
	
	

}
