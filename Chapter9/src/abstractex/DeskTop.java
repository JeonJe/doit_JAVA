package abstractex;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	
	public void turnOn() {
		System.out.println("����ũ�� ������ ŵ�ϴ�.");
	}
	
	public void turnOff() {
		System.out.println("����ũ�� ������ ���ϴ�.");
	}

}
