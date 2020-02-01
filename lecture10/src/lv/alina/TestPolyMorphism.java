package lv.alina;

import lv.alina.polymorphism.Animal;
import lv.alina.polymorphism.Cat;
import lv.alina.polymorphism.Dog;

public class TestPolyMorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal myAnimals = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myAnimals.animalSound();
		myDog.animalSound();
		myCat.animalSound();
	}

}
