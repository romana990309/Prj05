package ex03;

import java.time.LocalDate;

/*  aespa
 * 윈터 · 카리나 ·   지젤 · 		닝닝
 * 2000    2000      2001   		2002
 * 리더   메인래퍼  메인보컬  	   메인보컬
 */

class 	GMember 	{
		// Filds :private
		private String  name;
		private int		bYear;
		private String  role;
		
		// 객체지향언어의 특징
		// 다형성 polymophism
		// 1. OverLoading - 같은 이름의 생성자나 함수가 (인자갯수가 다른) 여러개 있어요
		// Constructor 생성자 : 객체를 생성 (new) 할때 실행되는 명령
		
		// 기본 생성자 : 인자없는 생성자 , NoArgsConstructor
		public GMember() {
			System.out.println("Hi 방가.....");
		}
		// 모든 인자있는 생성자,AllArgsConstructor
		public  GMember(String name, int bYear, String role) {
			this.name  = name;
			if(bYear <=1910)
				bYear = LocalDate.now().getYear();
			this.bYear = bYear;
			this.role  = role;
		}
		// Method :public
		public void info() {		
			int age = LocalDate.now().getYear() - bYear;
			System.out.printf("%s %d %d %s\n", 
					name, bYear, age, role);
		}
}

public class MamberTest {
	// null 널	:변수를 만들었으나 사용한적이 없다
	// ""	빈문자열 empty string
	
	
	// 모두 대문자 : 컨트롤 시프트 x
	// 모두 소문자 : 컨트롤 시프트 y
	public static void main(String[] args) {
		/*
			GMember aespa = new GMember();
			aespa.info();
			GMember r2 = null;
			System.out.println(r2);
		*/
		
		GMember r0 =new GMember();
		//r1.name = "윈터"  		
				//오류 : private 변수를 .으로 직접 사용했다	
				//The field GMember.name is not visible
				
		// private 변수에 값을 넣는 방법 2가지
		// 1. 생성자를 이용
		
		GMember r1 =new GMember("윈터", 2000, "리더");
		 r1.info();
		// 2. Getter / Setter 를 사용
				
				
				
				
				
				
	}

}
