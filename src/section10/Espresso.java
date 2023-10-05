package section10;

//Coffee클래스 를 상속받는 Espresso클래스
public class Espresso extends Coffee{
	
	public String brand;
	
	//상속받은 Espresso클래스는 Coffee클래스의 메서드 사용 가능
	public Espresso(String bean) {
		super(bean);
		this.brand = "스타벅스";
	}

	
	public void brew() {
		System.out.println(super.bean + "산 에스프레소");
	}
	
	@Override // 어노테이션(annotation) - 클래스, 메서드, 필드 등 추가적인 메타정보 제공
	public void printInfo() {
		super.printInfo();
		System.out.println("brand : " + brand);
	}
}
