package inheritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}	
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 움직입니다.");
	}	
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}	
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리는 하늘을 납니다");
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
