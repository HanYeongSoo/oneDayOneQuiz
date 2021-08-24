
public class Quiz12 {

	public static void main(String[] args) {
		/*
		 * 		입력된 수(n) 만큼 n행 n열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
		 * 		4를 입력하면
		 * 		1 5 9 13
		 * 		2 6 10 14
		 * 		3 7 11 15
		 * 		4 8 12 16
		 * 
		 */
		
		int num = 4;
		int arr[][] = new int [num][num];
		
		int count =1;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				arr[j][i] = count;
				count++;
			}
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
