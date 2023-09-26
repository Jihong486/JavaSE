package section06;

public class ArrayHomeWork01 {
	public static void main(String[] args) {
		// i는 행, j는 해당 i의 배열 값
		int[][] array = new int[7][7];

		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				int value = i * 7 + j + 1;
				array[i][j] = value;
			}
		}
		
		for(int i=0; i<13; i++) {
			if(i<7) {
				for(int j=0; j<i+1; j++) {
					if(i%2==0) {
						System.out.print(array[i-j][j] + " ");
					}
					else {
						System.out.print(array[j][i-j] + " ");
					}
				}
			}
			else {
				for(int j=0; j<13-i; j++) {
					if(i%2==0) {
						System.out.print(array[6-j][i-6+j] + " ");
					}
					else {
						System.out.print(array[i-6+j][6-j] + " ");
					}
											
				}
				
			}
			
		}
	
	}

}