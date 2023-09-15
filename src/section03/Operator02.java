package section03;
/*
 * 2. 증감연산자
 * 	++ : 1씩 증가시킨다.
 * 	-- : 1씩 감소시킨다. 
 */
public class Operator02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num);	// 1
		num++;
		System.out.println(num);	// 2
		
		System.out.println(++num);	// 전위증감연산자 - 명령어가 실행전 1증가 > 3
		System.out.println(num++);	// 후위증감연산자 - 명령어가 실행후 1증가 > 3
		System.out.println(num);	// 바로 직전 후위증감연산자(num++)로 인해 > 4 
		System.out.println(--num);	// > 3
		System.out.println(num--);	// > 3
		System.out.println(num); 	// > 2
	}

}
