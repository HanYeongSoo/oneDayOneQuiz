import java.util.Iterator;
import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		/*
		 * 		�Էµ� ���� �� �ڸ��� �� ���ϱ�
		 * 		ex) 1242 �̸� ����� 9
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		num = input.nextInt();
		
//		System.out.println(num % 10);
		
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
		
	}

}
