package 객체;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat mycat1 = new Cat();
		System.out.println(mycat1.name);
		mycat1.jump();
		
		Human hong = new Human();
		Dog mydog1 = new Dog();
		hong.taming(mycat1);
		hong.taming(mydog1);
	}

}
