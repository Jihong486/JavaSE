package section03;
/*
 * 5. 대입연산자
 * 	=
 * 복합대입연산자
 * 	+=, -=, *=, /=, %=
 * 
 */
public class Operator05 {
	public static void main(String[] args) {
		int num = 23;
		
		num += 4;	// num = num + 4; 와 같다.
		System.out.println("num : " + num);
		
		num -= 5;
		System.out.println("num : " + num);
	}

}
