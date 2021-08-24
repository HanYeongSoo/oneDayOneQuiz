import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		/*
		 * 		입력된 수(n) 만큼 n행 n열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
		 * 		4를 입력하면
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
