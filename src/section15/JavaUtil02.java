package section15;

import java.util.Random;

public class JavaUtil02 {
	public static void main(String[] args) {
		
		int[] iArray = new int[45]; //45개를 담을 배열,
		
		for(int i=0; i<iArray.length; i++) {
			iArray[i] = i+1;
		}
		//iArray = {1,2,3,4, ...}
		Random ran = new Random();
		
		for(int i=0; i<iArray.length; i++) { //for문을 45번 
			
			int cIndex = ran.nextInt(45); // 0~44사이 난수값 반환
			
			/*
			 * cIndex = 3
			 * i = 0
			 * iArray[0] = 4
			 * tmp = 1  << 임시저장.
			 * iArray[3] = 1
			 * 
			 */
			// 결국 배열값에 따라 스왑됨.
			
			
			//중요.
			int tmp = iArray[i];
			iArray[i] = iArray[cIndex];
			iArray[cIndex] = tmp;
			
		}
		//스왑되며 섞인것중에 6자리 출력. >> 로또번호 출력.
		for(int i=0; i<6; i++) {
			System.out.println(iArray[i] + "/");
		}
			
	}
}
