import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		/*
		 * 		�Էµ� ��(n) ��ŭ n�� n���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�.
		 * 		4�� �Է��ϸ�
		 * 		1 2 3 4
		 * 		5 6 7 8
		 * 		9 10 11 12
		 * 		13 14 15 16
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		num = input.nextInt();
		
		int count = 1;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
			
		}
	}

}
