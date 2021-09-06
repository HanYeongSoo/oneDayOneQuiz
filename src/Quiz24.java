
public class Quiz24 {

	public static void main(String[] args) {
		/*
		 * 		평균보다 넘은 학생들의 비율을 출력하시오.
		 * 		7명의 학생 수 >> 100 95 90 80 70 60 50 의 평균 비율 = 57.143% 
		 */
		
		int arr [] = {7, 100, 95, 90, 80, 70, 60, 50};
		int sum = 0;
		double avg = 0;
		
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = (double)sum / arr[0];
		System.out.println(avg);
		
		int count = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > avg) {
//				count += arr[i];
				count++;
			}
		}
		
		System.out.println((double)count/arr[0] * 100);
		
	}

}
