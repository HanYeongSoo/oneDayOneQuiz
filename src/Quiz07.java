import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		num = input.nextInt();
		
		while(true) {
			if (num % 2 != 0 && num % 3 != 0) {
				System.out.println(num + "�� �Ҽ��Դϴ�.");
				break; 
			}
			else {
				System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
				break; 
			}
		} 
	}

}
