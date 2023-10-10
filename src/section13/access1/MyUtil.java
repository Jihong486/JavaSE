package section13.access1;

public class MyUtil {
	
	public String str1 = "일반멤버 변수";
	public static String str2 = "정적멤버 변수";
	
	//내부클래스가 있는 클래스 두개. 하나는 static.
	
	public class HelloPrinter {
		public void printerHello() {
			System.out.println("인스턴트 내부클래스 HelloPrinter 입니다.");
			System.out.println(str1); // >> 사용가능? 가능
			System.out.println(str2); // >> 사용가능? 가능
		}
	}
	
	public static class Calculater {
		public void calc(int a,int b) {
			System.out.println("전달받은 두 정수의 합 : " + (a+b));
		//	System.out.println(str1); >> 사용가능? 불가능. 
			System.out.println(str2); // >> 사용가능? 가능
							
		}
	}
	
	
}
