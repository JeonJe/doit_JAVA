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
		System.out.println("데스크톱 전원을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("데스크톱 전원을 끕니다.");
	}

}
