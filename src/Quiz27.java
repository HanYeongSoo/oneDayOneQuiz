
public class Quiz27 {

	public static void main(String[] args) {
		/*
		 * 		달팽이 입력
		 * 
		 * 		1 2 3 4 5
		 * 		16 17 18 19 6
		 * 		15 24 25 20 7
		 * 		14 23 22 21 8
		 * 		13 12 11 10 9
		 * 
		 * 		와 너무어렵다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		와 너무어렵다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		와 너무어렵다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		와 너무어렵다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 */
		
		int n = 5;
		int arr[] [] = new int [7][7];
		
		int x = 0;		// 좌표
		int y = 0;		// 좌표
		int num = 1;
		int count = n;	// 1 2 3 4 5 에서 6이 아래로 가야하니까 그거 맞춰주기 위한 count
		
		for (int i = 0; i < 2*n-1; i++) {
			switch (i % 4) {
			case 0:		// right way
					for (int j = 0; j < count; j++) {
						arr[x][y] = num;
						y++;
						num++;
					}
					y--;
					x++;
					
					count--;
				break;
			case 1:		// under way
					for (int j = 0; j < count; j++) {
						arr[x][y] = num;
						x++;
						num++;
					}
					x--;
					y--;
					
				break;
			case 2:		// left way
					for (int j = 0; j < count; j++) {
						arr[x][y] = num;
						y--;
						num++;
					}
					y++;
					x--;
					
					count--;
				break;
			case 3:		// up way
					for (int j = 0; j < count; j++) {
						arr[x][y] = num;
						x--;
						num++;
					}
					x++;
					y++;
					
				break;

			}
		}
		
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println("");
		}
	}

}
