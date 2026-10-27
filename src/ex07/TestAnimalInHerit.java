package ex07;

class Animal {
	String name;
	void 	eat() {
		   System.out.println(name +"(이)가 먹는다.");
	}
}


class Dog extends Animal {
	    void 	bark() {
	    	System.out.println(name + "(이)가 멍멍");
	}
}

class Cat extends Animal{
	     void 	meow() {
			System.out.println(name + "(이)가 야옹");
		}
}

class Tiger extends Animal{
	      void    cry() {
	    	 System.out.println(name + "(이)가 어흥~~~");
	}
}

public class TestAnimalInHerit {

	public static void main(String[] args) {
		Dog  bori = new Dog();
		work(bori,"보리");
		
		
		
		Cat som = new Cat();
		work(som, "솜");

		Tiger ho =new Tiger();
		work(ho,"호");
		
		
		
	}

	// 2. 동일한 부모글래스를 상속한 클래스일 경우 하나의 함수로 구현가능
	private static void work(Animal animal, String name) {
		animal.name = "보리";
		animal.eat();
		
		//class 강제 형변환
		//animal 이 Dog 타입에서 호출된 것인가?
		if(animal instanceof Dog) 
			((Dog) animal).bark();
		
		if(animal instanceof Cat)
			((Cat)animal).meow();
		
		
	}
	
	
	
    // method overloading 으로 처리
	/* private static void work(Tiger ho, String string) {
		ho.name = "호";
		ho.eat();
		ho.cry();
	}

	private static void work(Cat som, String string) {
		som.name = "솜";
		som.eat();
		som.meow();
	}

	private static void work(Dog bori, String string) {
		bori.name = "보리";
		bori.eat();
		bori.bark();
		
	}*/

}
