import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		/*
		 * 		�Էµ� ������ ������ ���϶�
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		num = input.nextInt();
		
		int arr [] = new int [10];
		
		while(num > 0) {
			arr[num % 10]++;
			num = num/10;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		
	}

}
