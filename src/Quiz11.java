
public class Quiz11 {

	public static void main(String[] args) {
		/*
		 * 		입력된 수(n) 만큼 n행 n열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
		 * 		4를 입력하면
		 * 		1 2 3 4
		 * 		8 7 6 5
		 * 		9 10 11 12
		 * 		16 15 14 13
		 * 
		 * 		@못풀었습니다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		@못풀었습니다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		@못풀었습니다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		@못풀었습니다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		@못풀었습니다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 */
		
		int num = 4;
		
		int arr [ ] [ ] = new int [num] [num];
		
		for (int i = 0; i < num; i++) {
			
			if (i % 2 == 0) {
				for (int j = 0; j < num; j++) {
					arr[i][j] = i * num + j + 1;
				}
				
			} else {
				
				for (int j = num - 1; j >= 0; j--) {
					arr[i][j] = i * num + num - j;
				}
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
