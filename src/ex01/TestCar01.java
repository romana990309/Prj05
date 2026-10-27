package ex01;

// CRLF : 줄바꿈
// LF : line feed		 \n 	0x0a (10)
// CR : Carriage Return  \r		0x0d(13)
// unix, linux, android : \n
// window				:\r\n
// mac					:\r

public class TestCar01 {

	public static void main(String[] args) {
		System.out.println("우리집차\n보유현황\n");

		String 	name1 	 = 	"아빠차";
		String 	color1	 = 	"Black";
		int 	year1	 = 	 2023;
		
		System.out.println("차 이름:" + name1 );
		System.out.println("차 색상:" + color1 );
		System.out.println("차 연식:" + year1 );
		
		String 	name2 	 = 	"엄마차";
		String 	color2	 = 	"Red";
		int 	year2	 = 	 2022;
		
		System.out.println("\n차 이름:" + name2 );
		System.out.println("차 색상:" + color2 );
		System.out.println("차 연식:" + year2 );
		
		String 	name3 	 = 	"내차";
		String 	color3	 = 	"Blue";
		int 	year3	 = 	 2026;
		
		System.out.println("\n차 이름:" + name3 );
		System.out.println("차 색상:" + color3 );
		System.out.println("차 연식:" + year3 );
		
	}

}
