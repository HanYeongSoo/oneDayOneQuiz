
public class Quiz11 {

	public static void main(String[] args) {
		/*
		 * 		�Էµ� ��(n) ��ŭ n�� n���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�.
		 * 		4�� �Է��ϸ�
		 * 		1 2 3 4
		 * 		8 7 6 5
		 * 		9 10 11 12
		 * 		16 15 14 13
		 * 
		 * 		@��Ǯ�����ϴ�@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		@��Ǯ�����ϴ�@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		@��Ǯ�����ϴ�@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		@��Ǯ�����ϴ�@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * 		@��Ǯ�����ϴ�@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
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
