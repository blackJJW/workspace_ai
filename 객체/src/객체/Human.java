package 객체;

public class Human {
	String name = "홍길동";
	int age = 30;
	String gender = "male";
	
	public void taming(Cat animal) {
		System.out.println(this.name+ "이 "+ animal.name+ "을(를) 길들이겠습니다.");
	}
	
	public void taming(Dog animal) {
		System.out.println(this.name+ "이 "+ animal.name+ "을(를) 길들이겠습니다.");
	}
	
	public void run() {
		System.out.println("running~~~");
	}
}
