package section08;

public class Method07 {
	public static void main(String[] args) {
		
		int[] values = {23, 7, 88, 45, 1, 3, 19};
		
		double[] result = summary(values);
		
		System.out.println("합계 : " + result[0]);
		System.out.println("평균 : " + result[1]);
		
	}
	
	public static double[] summary(int[] values) {
		//result[0] : 합계, result[1] : 평균
		double[] result = new double[2];
		
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		
		double avg = sum /(double) values.length; //values.length 값은 int타입이기 때문에 double로 바꿔준다.
													
		
		result[0] = sum;
		result[1] = avg;
		
		
		return result;
	}
	
	
}