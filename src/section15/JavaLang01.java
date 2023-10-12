package section15;

import section15.access1.Soccer;

/*
 * java.lang 패키지
 * 	자바에서 기본적으로 제공해주는 패키지.
 * 	import 없이 사용이 가능하다.
 * 
 * Object 클래스
 * 	자바에서 모든 클래스의 최상위 부모 클래스.
 * 	명시하지 않아도 모든 클래스는 Object를 상속받는다.
 * 
 * 	equals() 메서드 : 두 객체가 동일한 객체면 true, 동일하지 않으면 false를 반환.
 *	hashcode() 메서드 : 객체의 메모리 번지를 이용, 해시코드를 만들어 반환.
 * 	toString() 메서드 : 객체의 문자정보를 리턴. 즉, 객체를 문자열로 표현.
 * 	clone() 메서드 : 객체복사. (단, Cloneable 인터페이스를 상속받은 객체만 사용가능.)	
 * 
 */
public class JavaLang01 {
	public static void main(String[] args) {
		
		Soccer soccer1 = new Soccer("리버풀","리버풀","1892","프리미어리그");
		Soccer soccer2 = new Soccer("리버풀","리버풀","1892","프리미어리그");
		
		
		System.out.println(soccer1);
		System.out.println(soccer1.toString()); // toString()메서드. 객체를 문자열로 표현.
		//toString()메서드는 따로 생성하지않았지만, Object클래스의 메서드이기에 생성하지않아도 사용가능
		System.out.println(soccer2);
		System.out.println(soccer2.toString()); 
		
		if(soccer1.equals(soccer2)) {
			System.out.println("soccer1 과 soccer2는 같다.");
		}
		else {
			System.out.println("soccer1 과 soccer2는 다르다.");
		}
		
		
		System.out.println(soccer1);
		System.out.println();
	}

}





