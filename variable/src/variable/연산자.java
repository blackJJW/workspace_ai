package variable;

public class 연산자 {

	public static void main(String[] args) {

		int a = 100;
		int b = 333;
		
		System.out.println(a++ + ++b);
		// ++ -- 증감연산자가 위에 있면 사용한 뒤 값을 변경
		// 앞에 있으면 변경한뒤 사용
		
		if(a++==101) {
			System.out.println("참");
		}
		
		char c = '하';
		String v= "하하";
	}

}
