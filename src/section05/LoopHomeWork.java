package section05;

public class LoopHomeWork {
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < 4; i++) {
			
			
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
	}
	
}
