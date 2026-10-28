package ex12;

class Emp {
	// fields
	private int eno; //사번
	private String name;
	private String phone;
	

	/*public Emp(int eno, String name, String phone) {
		super();
		this.eno = eno;
		this.name = name;
		this.phone = phone;
	}*/

	// getter / setter : 형태가 함수
	// Getter / Setter  
	
	

	public int getEno() {
		return eno;
	}
	
	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//method
	public void info() {
		System.out.printf("&d %s %s\n"
				,eno, name, phone);
	}


}

public class TestGetterSetter {

	public static void main(String[] args) {
		Emp emp1 = new Emp();
		// emp1.eno = 1;
		emp1.setEno(1);
		emp1.setName("장원영");
		emp1.setPhone("01041747764");
		emp1.info();
		
		/* emp1.setEno(1);
		System.out.println(emp1.getEno()); */
		
		//Emp emp2 =new Emp(2, "카리나", "01041747764");
		
		
	}

}
