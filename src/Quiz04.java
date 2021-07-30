import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		num = input.nextInt();
		
		int [ ] arr = new int [10];
		int i = 0;
		
		while(num > 0) {
			arr[i] = num % 2;
//			System.out.println(arr[i]);		25라고 치면 1 0 0 1 1 이 나옴.
			num = (num / 2) ;
			i++;
		}
		
		i--;
		for (; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
