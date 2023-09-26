package section08;

public class Method05 {
	public static void main(String[] args) {
		
		String name = getName();
		System.out.println("Name : " + name);
		
		System.out.println("getNmae() : " + getName());
		
	}
	// 6. 인자 X, 리턴 O >> 메서드 실행하여 연산결과 값 반환
	public static String getName() {
		String name = "홍길동";
		
		return name; // getNmae()메서드 안 String타입으로 선언된 변수 name값이 메인메서드로 반환.
	}
	
}
