
public class Quiz12 {

	public static void main(String[] args) {
		/*
		 * 		�Էµ� ��(n) ��ŭ n�� n���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�.
		 * 		4�� �Է��ϸ�
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
