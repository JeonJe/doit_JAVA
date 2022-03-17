package gamelevel;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("엄청빨리 달립니다");

	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 뜁니다.");

	}

	@Override
	public void turn() {
		System.out.println("원하는 방향으로 바꿉니다");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("***고급 레벨***");

	}
}
