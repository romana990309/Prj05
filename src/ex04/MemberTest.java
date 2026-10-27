package ex04;

import java.time.LocalDate;

/*  aespa
 * 윈터 · 카리나 ·   지젤 · 		닝닝
 * 2000    2000      2001   		2002
 * 리더   메인래퍼  메인보컬  	   메인보컬
 */

class GirlMember {
	//fields
	private String name;
	private int		bYear;
	private String role;

	// constructor
	public GirlMember(String name, int bYear, String role) {
		this.name = name;
		this.bYear = bYear;
		this.role = role;
	}
	
	//method
	public	void info() {
		int age = LocalDate.now().getYear() - bYear; 
		System.out.printf("%s %d년생 %d살 %s\n",
				name, bYear, age, role);
	}

	
	
}

public class MemberTest {

/*  aespa
 * 윈터 · 카리나 ·   지젤 · 		닝닝
 * 2000    2000      2001   		2002
 * 리더   메인래퍼  메인보컬  	   메인보컬
 */
	
	public static void main(String[] args) {
			
		GirlMember aespa1 = new GirlMember("윈터", 2000, "리더");
		aespa1.info();
		GirlMember aespa2 = new GirlMember("카리나", 2000, "메인래퍼");
		aespa2.info();
		GirlMember aespa3 = new GirlMember("지젤", 2001, "메인보컬");
		aespa3.info();
		GirlMember aespa4 = new GirlMember("닝닝", 2002, "메인보컬");
		aespa4.info();
		
		// 객체배열로 저장해서
		// 1. 먼저 저장할 배열을 인원수에 맞게 준비
		GirlMember [] aespaArr = new GirlMember[4];  //배열 생성
		
			aespaArr[0] = new GirlMember("윈터", 2000, "리더");
			aespaArr[1] = new GirlMember("카리나", 2000, "메인래퍼");
			aespaArr[2] = new GirlMember("지젤", 2001, "메인보컬");
			aespaArr[3] = new GirlMember("닝닝", 2002, "메인보컬");
			
		for (int i = 0; i < aespaArr.length; i++) {
			aespaArr[i].info();
		}
		
	}
}
