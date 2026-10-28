package ex11;
// interface 특징 : 규칙을 부여, 통일성

interface Ipo {
	void input();
	void process();
	void output();
}

class Job implements Ipo {

	@Override
	public void input() {
			System.out.println("받습니다.");
	}

	@Override
	public void process() {
		System.out.println("처리합니다.");
		
	}

	@Override
	public void output() {
		System.out.println("배출합니다.");
		
	}
	
}

public class TestInterface {
	
	public static void main(String[] args) {
		Job job = new Job();
		job.input();
		job.process();
		job.output();
	}

}
