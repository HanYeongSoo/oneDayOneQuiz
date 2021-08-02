import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		/*
		 * 		입력된 두 수의 최대공약수를 구하시오. 
		 * 		12 18을 입력하면
		 * 		6
		 */
		
		/*
		 * 		내가 해본거 ! ! !
		 * 
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int num1 = 0;
		int sum = 0;
		
		System.out.print("두수 입 력 > > > ");
		num = input.nextInt();
		num1 = input.nextInt();
		
		while(true) {
			
			if (num % 2 == 0 && num1 % 2 == 0) {
				num /= 2;
				num1 /= 2;
				sum += 2;
//				System.out.println(sum);
			} else if (num % 3 == 0 && num1 % 3 == 0) {
				num /= 3;
				num1 /= 3;
				sum += 3;
//				System.out.println(sum);
			} else {
				sum *= sum;
			}
			sum *= sum;
			break;
		}
		System.out.println(sum);
		*/
		
		/*
		 * 		유클리드 최대공약수 구하기
		 */
		Scanner input = new Scanner(System.in);
		
		int num01 = 0;
		int num02 = 0;
		
		num01 = input.nextInt();
		num02 = input.nextInt();
		
		while(num01 != num02) {
			if (num01 > num02) {
				num01 -= num02;
			} else {
				num02 -= num01;
			}
		}
		System.out.println(num01);
		
		
	}

}
