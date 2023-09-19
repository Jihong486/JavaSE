package section05;
/*
 * 반복문
 * 	특정한 부분의 코드가 반복적으로 수행될 수 있도록 하는 명령어.
 * 
 * 1. while 문(무한히 계속 실행.)
 * 	while(조건식) {
 * 		반복수행할 코드
 * }
 * 
 * 2. break 문
 * 	반복문에서 break라는 명령어는 해당 반복문 즉시종료하는 명령어.
 * 
 * 3. continue 문
 * 	반복문에서 해당 반복을 건너뛰고 다음 반복을 실행하도록 강제하는 명령어.
 * 
 */
public class Loop01 {
	public static void main(String[] args) {
//		//while문을 이용해서 0~99까지 출력.
//		
//		int count = 0;
//		while(count<100) {
//			System.out.println(count);
//			count++;
//		}
//		> 조건식이 false일때까지 계속 반복.
//		System.out.println();
//		
//		for문을 활용
//		for(int i=0; i<100; i++) {
//			System.out.println(i);
//		}
		
//		int count = 0;
//		boolean isRun = true;  > boolean 연산자에서 변수는 보통 is가붙음
//		while(isRun) {
//			System.out.println(count);
//			count++;
//			if(count==100)
//				isRun = false;
//		}
//		int count = 0;
//		while(true) {
//			System.out.println(count);
//			count++;
//			if(count==100)
//				break;
//		}
		
		int i = 0;
		while(i<100) {
			i++;
			
			if(i % 3 == 0)	// i가 3의 배수라면,
				continue;	// 해당되는 순간 건너뛰고 다음순서부터 다시 반복
			System.out.println(i);
		}
	
	}
	
	

}
