package section02;
/*
 * 형변환
 * 1.업캐스팅
 * 		- 표현 범위가 큰 데이터형으로 변환하기
 * 		- 자동으로 가능
 * 		- 데이터 손실이 없다
 * 2.다운캐스팅
 * 		- 표현 범위가 더 작은 데이터형으로 선언하기
 * 		- 명시적으로 해야한다.
 * 		- 
 * 
 * 
 */
public class Variable07 {
	public static void main(String[] args) {
		//업캐스팅 예
		byte ibyte = 10;
		int iInt = ibyte;	// 자동으로 형변환
		System.out.println("iInt : " + iInt);
		
		float iFloat = 10.1f;
		double iDouble = iFloat;
		System.out.println("iDouble : " + iDouble);		//출력 > 부동소수점오차
		
		//다운캐스팅 예
		int iInt2 = 130;
		// byte iByte2 = iInt2; > byte 가 int 보다 작으므로 오류.
		byte iByte2 = (byte)iInt2; // 강제형변환.
		System.out.println("iByte2 : " + iByte2);
		
		//실수 > 정수 형변환 예
		float iFloat2 = 3.1415f;
		int iInt3 = (int)iFloat2;	//강제형변환
		System.out.println("iInt3 : " + iInt3); // 정수부분만 출력. 
		
	}

}




