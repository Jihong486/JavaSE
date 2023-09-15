package section03;
/*
 * 4. 논리연산자
 * 	&& : And 조건, 교집합 개념,  두 항 모두 true일때  true 
 * 	|| : Or 조건, 합집합 개념, 두 항중 하나이상 true일때 true
 *	! : Not 조건, 여집합 개념, 논리(boolean)값 반전 시킨다.
 * 
 */
public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false; // true && true 여야 ture 출력.
		System.out.println("result : " + result); // > false 출력.
		
		int age = 28;
		int sex = 1; // 성별 남 : 1, 여자 : 2
		if(age >= 19 && sex == 1) {
			System.out.println("성인 남성입니다.");
		}
		boolean result2 = true || false;
		System.out.println("result : " + result2);
		
		result2 = !result2;
		System.out.println("!result : " + result2);
		
		String category = "식품";
		if(category == "식품" || category == "전기전자" || category == "의류") {
			System.out.println("20% 할인행사 중입니다.");
		}
		else {
			System.out.println("할인 미적용 상품입니다.");
		}
	
		boolean result3 = ((true && true) && true) || false;	//원하는 우선순위가 있다면, ()사용.
		System.out.println(result3);
	}
	
}
