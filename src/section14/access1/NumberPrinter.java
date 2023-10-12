package section14.access1;

public class NumberPrinter {
	
	public void printNumber() throws InterruptedException {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			Thread.sleep(1000); //원래는 try,catch 예외처리를 해줘야하나, throws키워드를 사용.
		}
		
	}
	
}
