package section11;

import section11.access1.Car;
import section11.access1.Bus;

/*
 * 클래스에서 객체 타입 변환
 *  서로 상속 관계에 있는 클래스 사이에서 변환할 수 있다.
 * 
 * 1. 자동타입변환
 * 	부모클래스(타입) - 객체변수 = new 자식클래스();
 * 	부모클래스(타입) - 객체변수 = 자식객체;
 * 
 * 2. 강제형변환
 * 	부모타입으로 자동타입 변환되었던, 자식객체를 다시 자식타입으로 변환할때만 가능.
 * 	자식타입변수 = (자식타입) 부모타입의 자식개체;
 * 
 * 다형성(Polymorphism)
 * 	객체지향프로그래밍의 개념으로, 하나의 인터페이스나 클래스를 사용하여,
 * 	여러 다른타입의 객체를 다룰 수 있는 능력을 말한다.
 * 
 */
public class Polymorphism01 {
	
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.drive();
		bus1.clickBell();
		
		Car car = new Bus();  //Bus객체를 생성.
		car.drive();
//		car.clickBell();  //문법상 오류. Bus라는 객체는 맞지만 변수타입은 Car(부모타입)이기때문에.
		
		Bus bus2 = (Bus) car; //강제형 변환. 부모타입에서 자식타입으로 대입시 형변환 필수.
		bus2.drive();
		bus2.clickBell();
		
		
	}

}



