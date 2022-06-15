package variable;

public class 함수 {
//	접근제한자 리턴타입 메소드명(인자타입 인자명, 인자타입 인자명...){
//	    함수본문;
//	    리턴타입 void가 아닐경우 리턴문;
//	  }
	
	public void printDan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d", dan, i, dan * i);
		}
	}
	
	// input x , output x 
	// input x , output o
	// input o , output x
	// input o , output o
	
	public void helloWorld() {// input x , output x 
		System.out.println("hello");
		System.out.println("world");
	}
	
	public String cry() {// input x , output o
		return "엉엉";
	}
	
	public String cry2(String name) {// input o , output o
		String result = "";
		switch(name) {
		case "tiger":
			result = "어흥";
			break;
		case "dolphine":
			result = "삐이익";
			break;
		case "monkey":
			result = "우끼";
			break;
		}
		return result;
	}
}
