package ex02;

// access modifier : 접근제한자
// private		   : 해당클래스에서만 사용가능
// package		   : 해당 패키지에서 사용가능 (접근제한자를 생략하면)
// protected	   : 패키지 + protected (상속관계에서 공유한다)
// public		   : 모든 곳에서 사용가능 다른 클래스에서도

// static		: 정적 - 컴파일시
// dynamic		: 동적 - 실행시
//			compile		 linking
// test.c -> test.obj ->  		-> test.exe
//						.lib : 컴파일 추가
// static linking library
//--------------------------------
//    compile		
// test.c -> test.obj -> test.exe
//							+	.dll : 실행할 때 라이브러리
// dynamic linking library

// class : 설계도 <- 우리가 표현하고 싶은 대상(객체)
class Car {
		// fields
		String  name;
		String  color;
		int		year;
	
		//methods
		void info() {
			System.out.println("차 이름:" + name );
			System.out.println("차 색상:" + color );
			System.out.println("차 연식:" + year );
		}
}

public class TestCar02 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name 	= "아빠차";
		car1.color 	= "black";
		car1.year 	= 2026;
		car1.info();
		
		System.out.print("\n");
		
		Car car2 = new Car();
		car2.name 	= "엄마차";
		car2.color 	= "red";
		car2.year 	= 2026;
		car2.info();
		
		
	}

}
