package section08;

public class RecursionEx {
	
	//일반 반복 메서드
	public static void printNumber(int n) {
		while(n>10) {
			System.out.println(n);
			n--;
		}
	}
	
	//재귀 메서드
	public static void recursionPrintNumber (int n) {
		if(n>0) {
			System.out.println(n);
			recursionPrintNumber(n-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		//매개변수 10 > 0~9까지 출력하기
		printNumber(10);
	}
}
