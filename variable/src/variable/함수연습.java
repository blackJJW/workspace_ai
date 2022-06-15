package variable;

public class 함수연습 {
	public int add (int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int bigNumMinus(int a, int b) {
		
		if (a > b) {
			return minus(a, b);
		} else {
			return minus(b, a);
		}
	}
	
	public int getMaxNum (int a, int b, int c) {
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}
	
	public boolean isOverHundred (int a) {
		if (a > 100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printEven() {
		
		for (int i=1; i <=100 ; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public void printThreeMul() {
		for (int i = 1; i <= 100; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
	}
	
	public void printFiveMul() {
		for (int i = 1;i <= 100; i++) {
			if (i%5==0) {
				if(i%10 !=0 ) {
					System.out.println(i);
				}
			}
		}
	}
	
	public void printStrings(String a, int b) {
		if (b < 0) {
			System.out.println("Error : int must be bigger than 0 !!!");
			return ;
		}else {
			for (int i = 1; i <= b; i++) {
				System.out.println(a);
			}
			
		}
		
	}
	
	public String getSeason(int a) {
		if (a == 3 || a == 4 || a == 5) {
			return "봄";
		}if (a == 6 || a == 7 || a == 8) {
			return "여름";
		}if (a == 9 || a == 10 || a == 11) {
			return "가을";
		}else {
			return "겨울";
		}
	}
	
	public boolean isInclude(String a, String b) {
		if (a.contains(b)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int howManyString(String a, String b) {
		int count = 0;
		int i = 0;
		
		while (a.length() > 0) {
			if (a.indexOf(b) > -1) {
				i = a.indexOf(b);
				count++;
			}else {
				break;
			}
			a = a.substring(i+b.length());
		}
		
		return count;
	}
	
	public boolean isOver100(String a) {
		if (a.length() <= 100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOver(String input, int criteria) {
		if (input.length() <= criteria) {
			return true;
		}
		else {
			return false;
		}
	}
}
