
public class Quiz13 {

	public static void main(String[] args) {
		/*
		 * 		�Էµ� ��(n) ��ŭ n�� n���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�.
		 * 		4�� �Է��ϸ�
		 * 		1 2 3 4
		 * 		2 4 6 8
		 * 		3 6 9 12
		 * 		4 8 12 16
		 * 		�� �����..
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
