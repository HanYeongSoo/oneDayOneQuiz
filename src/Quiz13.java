
public class Quiz13 {

	public static void main(String[] args) {
		/*
		 * 		입력된 수(n) 만큼 n행 n열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
		 * 		4를 입력하면
		 * 		1 2 3 4
		 * 		2 4 6 8
		 * 		3 6 9 12
		 * 		4 8 12 16
		 * 		깃 어려워..
		 */
		
		int num = 4;
		int arr[][] = new int [num][num];
		
		int count = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				arr[i][j] = (i+1) * (j+1);
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
