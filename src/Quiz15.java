import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		/*
		 * 		������ ���
		 * 		���� �Է��� ������ ������ ������ 2 3 �Է��ϸ� 2���̶�3�ܳ�����
		 * 
		 * 		�Է°����� ������ �ϴ°� �𸣰ڳ׿�@@@@@@@@@@@@@@@@@@@@@
		 * 		�Է°����� ������ �ϴ°� �𸣰ڳ׿�@@@@@@@@@@@@@@@@@@@@@
		 * 		�Է°����� ������ �ϴ°� �𸣰ڳ׿�@@@@@@@@@@@@@@@@@@@@@
		 */
		
//		Scanner input = new Scanner(System.in);
//		int num;
//		num = input.nextInt();
		
		int n =2;
		int m = 5;
		
		for (int i = 1; i <= 9; i++) {
			for (int j = n; j <= m; j++) {
//			System.out.println(j + " * " + i + " = " + j*i);
				System.out.printf("%2d * %2d = %3d", j, i, j*i);
			}
			System.out.println();
//			System.out.println(num + " * " + i + " = " + num*i);
		}
		
		
	}

}
