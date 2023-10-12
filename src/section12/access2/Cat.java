package section12.access2;

public interface Cat {
	
	public static final int PAW = 4; 
	// ststic과 final 키워드를 생략해도 무조건 상수. interface에서 변수는 상수.
	
	public abstract void eat();
	public void sleep(); // abstract 키워드를 생략해도 추상메서드이다.
	public void hunt();
	


}
