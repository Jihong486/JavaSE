package section13;

import section13.access2.Bird;

/*
 * 익명클래스(Anonymous Class)
 * 	다른 내부클래스와 달리 이름이 없는 클래스
 * 	선언과 객체의 생성을 동시에 하므로, 단 한번만 사용할 수 있다.(일회용 클래스)
 * 
 */
public class OuterClass05 {
	public static void main(String[] args) {
		Bird bird = new Bird() {

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				
			}
			
		}
	}
	

}
