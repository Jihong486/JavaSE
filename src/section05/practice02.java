package section05;

public class practice02 {
	public static void main(String[] args) {
		for(int k=0; k<3; k++ ) {
			
			for(int i=0; i<9; i++) {
				
				for(int j=0; j<3; j++) { //4단까지.
					int dan = j+2 + (k*3);
					int num = i+1;
					
					if(dan>9) break;
//					if(dan<10) {
//						System.out.print(dan+"x"+num+"="+dan*num+"\t");
//					} 
//					로도 가능.
					
					System.out.print(dan+"x"+num+"="+dan*num+"\t");	// '\t' - 탭키로 띄움.
					// System.out.printf("%dx%d=%d\t", dan, num, dan*num);	으로도 출력가능.
				}
				System.out.println();	//개행
			}
			System.out.println();
		}
	}

}
