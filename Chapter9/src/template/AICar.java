package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("로봇이 운전합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("로봇이 정지합니다.");
		
	}

	@Override
	public void wiper() {
		System.out.println("AI wiper");
		
	}

	@Override
	public void washCar() {
		System.out.println("차가 자동으로 세차됩니다.");
	}
	
	
}
