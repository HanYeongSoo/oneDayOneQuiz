import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		/*
		 * 		구구단 출력
		 * 		내가 입력한 값들의 구구단 나오게 2 3 입력하면 2단이랑3단나오게
		 * 
		 * 		입력값으로 나오게 하는건 모르겠네요@@@@@@@@@@@@@@@@@@@@@
		 * 		입력값으로 나오게 하는건 모르겠네요@@@@@@@@@@@@@@@@@@@@@
		 * 		입력값으로 나오게 하는건 모르겠네요@@@@@@@@@@@@@@@@@@@@@
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
