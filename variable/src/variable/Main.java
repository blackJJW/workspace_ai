package variable;

public class Main {

	public static void main(String[] args) {
		
//		int a = 5;
//		double b = 7.5;
//		System.out.println(a+b);
//		
//		// call by value, 기본형, 값에 의한 참조
//		char x = 'a';
//		String y = "hello";
//		System.out.println(x+y);
//		
//		int myNum = a;
//		myNum = myNum + 10;
//		System.out.println("muNum : " + myNum);
//		System.out.println("a : " + a);
//		
//		// call by reference 참조형 주소에 의한 참조
//		String[] arr1 = {"a", "b"};
//		String[] arr2 = {"c", "d", ""};
//		arr1 = arr2;
//		arr2[2] = "f";
//		for (int i = 0; i <arr1.length; i++) {
//			System.out.println(arr1[i]); 
//		}
		
		함수연습 fn1 = new 함수연습();
//		System.out.println(fn1.bigNumMinus(1, 1));
//		System.out.println(fn1.bigNumMinus(2, 1));
//		System.out.println(fn1.bigNumMinus(1, 2));
//		int result = fn1.getMaxNum(20, -720, 355);
//		System.out.println(fn1.isOverHundred(result));
//		
//		System.out.println(fn1.getSeason(1));
		System.out.println(fn1.howManyString("abcdebcbc", "bc"));
	}

}
