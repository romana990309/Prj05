package ex08;
// abstract (추상) class
abstract class Animal {
	String name;
	void 	eat(String food) {
		   System.out.println(name +"(이)가" + food + "먹는다.");
	}
	abstract void sound();  // abstract : 코딩이 없는 함수를 만든다
							// 추상 메소드
	
}

class Dog extends Animal {
	
	@Override //재정의 abstract 메소드를 자식이 다시 작성한다.
	void sound() {
		System.out.println(name + "(이)가 멍멍");
		
	}
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println(name + "(이)가 야옹");
		
	}
	
}
class Tiger extends Animal {

	@Override
	void sound() {
		System.out.println(name + "(이)가 어흥");
		
	}
	
}

public class TestAnimal {

	public static void main(String[] args) {
			// Animal ani = new Animal(); abstract class 는 new 불가능
		Dog bori = new Dog();
		work(bori, "보리", " 사료");
		
		Cat som = new Cat();
		work(som, "솜", " 츄르");
		
		Tiger ho = new Tiger();
		work(ho, "호", " 닭 한마리");
	}

	private static void work(Animal animal, String name,String food) {
		animal.name = name;
		animal.eat(food);
		animal.sound();
		
		
	}

}
