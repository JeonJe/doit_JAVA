package inheritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}	
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �����Դϴ�.");
	}	
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �Ƚ��ϴ�.");
	}	
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�");
	}
}
public class Animaltest {

	public static void main(String[] args) {
		
		Animaltest test = new Animaltest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
