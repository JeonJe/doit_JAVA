package interfaceex;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("판다");
		
		
	}

	@Override
	public void Buy() {
		System.out.println("산다");
		
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
	
	

}
