package extendsExamples;

/**
 * Another example of polymorphism
 * @author CarsonChen
 *
 */
public class PolymorphismExample2 {

	public static void main(String[] args) {
		
		Master master = new Master();
		master.feed(new Animal2(), new Food());
		master.feed(new Cat2(), new Fish());
		master.feed(new Dog2(), new Bone());

	}

}

class Animal2 {
	public void eat(Food f) {
		System.out.println("I am an animal, I am eating "+f.getFood());
	}
	
}

class Cat2 extends Animal2{
	public void eat(Food f) {
		System.out.println("I am a cat, I am eating "+f.getFood());
	}
}

class Dog2 extends Animal2{
	public void eat(Food f) {
		System.out.println("I am a dog, I am eating "+f.getFood());
	}
}


class Food {
	private String desc = "Food";
	public String getFood() {
		return desc;
	}
}

class Fish extends Food {
	private String desc = "Fish";
	public String getFood() {
		return desc;
	}
}

class Bone extends Food {
	private String desc = "Bone";
	public String getFood() {
		return desc;
	}
}

class Master {
	public void feed(Animal2 animal, Food food) {
		animal.eat(food);
	}
}
