package section05;

/*
 * 바깥포문이 행
 * 안쪽포문이 찍어내는
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */




public class practice {
	public static void main(String[] args) {
		
		for(int i=0; i<7; i++) {
			
			for(int j=0; j<7; j++) {
				if(i<4) {
					if(i+j<3){
						System.out.print(" ");
					}
					else if(j-i>3) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
					
					}
				else {
					if(i-j>3) {
						System.out.print(" ");
					}
					else if(i+j>9){
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}

			}
			System.out.println();	//개행
		}
			
	}

}
