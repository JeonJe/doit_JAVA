package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.Buy();
		
		Sell seller = customer;
		seller.sell();
		
		buyer.order();
		seller.order();

	}

}
