package section02;
/*
 * 이스케이프(Escape) 문자
 * 특정한 문자나 문자열을 특별한 용도로 해석하도옥 하는 문자.
 * 
 * \\ : 역슬래시 자체를 나타낸다.
 * \" : 쌍따옴표를 나타낸다.
 * \' : 작은따옴표를 나타낸다.
 * \n : 새 중(줄 바꿈)을 나타낸다.
 * \t : 탭 문자를 나타낸다.
 * \r : 캐리지 리턴(커서를 맨 앞으로.)을 나타낸다.
 * \b : 백스페이스를 나타낸다.
 * 
 * 
 */


public class Escape {
	public static void main(String[] args) {
		
		System.out.println("\"Hello, World!\"");	//"Hello, World!" 출력
		
		System.out.println("안녕하세요. \n이것은 줄바꿈입니다. \n탭 간격: \t1\t\t2\t\t\t3"); // 윈도우에서는 첫탭이 짭게출력됨.
	}

}
