package section02;
/*
 * 3. 정수형
 * 	byte	(1byte) : -128 ~ +127(0포함 127까지.)
 * 	short	(2byte) : -32,768 ~ +32,327
 * 	int		(4byte) : -2,147,483,648 ~ +2,147,483,647
 *	long	(8byte) 
 * 
 * Ctrl + S 저장 단축키
 * Ctrl + Shift + S 전체파일 저장 단축키
 */

public class Variable03 {
	public static void main(String[] args) {
		byte num1 = 20;
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		// byte num5 = 128; 에러 >> byte 저장할 수 있는 숫자범위(-128~127) 초과.
		long num6 = 2147483648L; // 숫자 리터럴 값이 int범위 초과하는 경우 L을 붙여 long형임을 컴파일러에게 알려줘야한다.
		//2진수 값 대입 0b로 시작
		byte num7 = 0b0100; //출력은 10진수로 출력.
		//8진수 값 대입 0으로 시작
		short num8 = 010;
		//16진수 값 대입 0x로 시작
		int num9 = 0xFF;		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		//byte over flow
		num1 += 120; // num1 = num1 + 120; >> 140.
		System.out.println(num1); 
	}

}
