package section07;
/*
 * 변수(Variable)\
 * 	데이터를 저장하고 조작하는데 사용되는 식별자로서의 이름을 가진
 * 	메모리 위치입니다.
 * 
 * 변수 선언 및 초기화
 * 	자료형(Type) 변수명 = 값 또는 참조값;
 * 
 *	1. 타입의 따른 변수
 *		기본형 - 예약이 되어있다. 소문자 시작. 직접 값을 저장하고 있다.
 *			8가지 : byte, int, double, short, long, char, float, boolean 
 *		참조형 - 기본형 외 나머지 전부. 보통 대문자 시작. 참조(주소)값을 가지고 있다.
 * 			ex) String, Math
 * 	2. 선언 위치에 따른 변수
 * 		전역변수 - 클래스 안에 선언된 변수(멤버변수) 
 * 				 초기화 하지않으면 default값이 들어간다.
 * 				   정수형 - 0
 * 				   실수형 - 0.0d
 * 				   boolean - false
 * 				   참조형 - null				 
 * 
 * 		지역변수 - 메서드 또는 생성자 안에 선언된 변수
 * 				 메서드 종료시 같이 소멸.
 * 				 매개변수도 지역변수.
 * 				 지역변수는 반드시 초기화 해줘야 한다.
 * 
 */
public class Var01 {
	
	//전역변수 (클래스 내부 선언된 변수)
	static int globalvar = 10;
	static int globalvar2;
	static double globalvar3;
	static boolean globalvar4;
	static String globalvar5;
	
	
	public static void localMethod() {
		//지역변수 선언
		int localVar = 20;
		System.out.println("전역변수 호출하기 : " + globalvar);
		System.out.println("지역변수 호출하기 : " + localVar);
		
	}
	public static void localMethod2() {
		System.out.println("전역변수 호출하기 : " + globalvar);
	 // System.out.println("지역변수 호출하기 : " + localVar); > localVar는 지역변수기 때문에 컴파일 오류.
		
	}
	public static void localMethod3() {
		int localVar; 
		
		System.out.println("전역변수 호출하기 : " + globalvar2);
		System.out.println("전역변수 호출하기 : " + globalvar3);
		System.out.println("전역변수 호출하기 : " + globalvar4);
		System.out.println("전역변수 호출하기 : " + globalvar5);
		
	 // System.out.println("지역변수 호출하기 : " + localVar);
		
	}
	public static void main(String[] args) {
		localMethod3();
	}
}
