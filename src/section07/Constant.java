package section07;
/*
 * 상수
 * 	처음 할당된 값이 변경되지 않는 변수를 의미.
 * 	final 예약어 사용
 * 	보통 대문자로 선언한다.
 * 
 */
public class Constant {
	
	static final double PI = 3.141592; //final 을 선언한 순간 PI는 상수.
	
	public static void main(String[] args) {
		//원의 반지름
		int r = 10;
		
		// PI = 3.2;  >> 상수 값은 변경되지 않으므로 컴파일 에러.
		
		double area = PI * r * r;
		System.out.println("원의 넓이 : " + area);
		
		area = Math.PI * Math.pow(r, 2);
		System.out.println("원의 넓이 : " + area);
		
	}

}
