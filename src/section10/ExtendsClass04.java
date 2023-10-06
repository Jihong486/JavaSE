package section10;

import section10.access3.Jindo;

/*
 * final 클래스
 * 	클래스 키워드 앞에 final 키워드 선언 시,
 * 	클래스 상속의 마지막임을 뜻한다. 즉 상속불가 클래스가 되어버린다.
 * 
 * final 메서드
 * 	메서드에서 final 선언하면 해당메서드는 서브클래스에서 오버라이드 할 수 없다.
 * 	오버라이드 불가 메서드.
 * 
 */
public class ExtendsClass04 {
	public static void main(String[] args) {
		Jindo jindo = new Jindo();
		jindo.bark();
	}

}
