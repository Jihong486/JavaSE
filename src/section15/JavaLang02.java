package section15;

import section15.access1.Soccer;
/*
 * 1.얉은복사(Shallow Copy)
 * 	참조형 변수에 주소값만 복사.
 * 	동일한 객체를 참조한다.
 * 
 * 2.깊은복사(Deep Copy)
 * 	객체의 멤버변수값과 객체가 참조하는 객체까지 모두 복사하는 방식.
 * 	새로운(다른) 객체를 참조하게 된다.	
 * 
 * 
 */
public class JavaLang02 {
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Soccer soccer1 = new Soccer("토트넘홋스퍼","런던","1882","프리미어리그");
		
		Soccer soccer2 = soccer1; //얉은복사
		
		Soccer soccer3 = (Soccer) soccer1.callClone();
		
		if(soccer1.equals(soccer2)) {
			System.out.println("soccer1 과 soccer2는 같다.");
		}
		else {
			System.out.println("soccer1 과 soccer2는 다르다.");
		}
		
		if(soccer1.equals(soccer3)) {
			System.out.println("soccer1 과 soccer3는 같다.");
		}
		else {
			System.out.println("soccer1 과 soccer3는 다르다.");
		}
		
		
	}
}
