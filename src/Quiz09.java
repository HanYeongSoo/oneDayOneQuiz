import java.util.Iterator;
import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		/*
		 * 		입력된 수의 각 자리수 합 구하기
		 * 		ex) 1242 이면 출력은 9
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
