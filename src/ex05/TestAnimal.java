package ex05;

class Dog {
		String name;
		void 	eat() {
		System.out.println(name +"(이)가 먹는다.");
	}
		void 	bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat{
		String name;
		void 	eat() {
			System.out.println(name +"(이)가 먹는다.");
		}
		void 	meow() {
			System.out.println(name + "(이)가 야옹");
		}
}



public class TestAnimal {

	public static void main(String[] args) {
		Dog  bori = new Dog();
		bori.name = "보리";
		bori.eat();
		bori.bark();
		
		Cat som = new Cat();
		som.name = "솜";
		som.eat();
		som.meow();

	}

}
