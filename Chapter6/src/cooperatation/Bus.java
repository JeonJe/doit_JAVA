package cooperatation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumer) {
		this.busNumber = busNumer;
	}
	
	public void take(int money) {
		passengerCount ++;
		this.money += money;
		
	}
	
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + money+"�Դϴ�.");
	}
	 
}
