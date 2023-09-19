package section05;
/*
 * 2. do ~ while 문
 * 	while 문과 비슷하지만, 조건식에 상관없이 최초 한번은 무조건 실행되는 반복문.
 * 
 * 
 */
public class Loop02 {
	public static void main(String[] args) {
		
		int count = 100;
		do {
			//반복실행할 코드 영역
			System.out.println(count);
			count++;
		}
		while (count<100); // 조건식 영역
		
	}

}
