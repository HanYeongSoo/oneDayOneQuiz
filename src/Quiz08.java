import java.util.Iterator;
import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;	// ÀÔ·Â°ª
		num = input.nextInt();
		
		int count = 1;	
				
		for (int i = num; i >= 1; i--) {
			count *= i;
		}
		System.out.println(count);
	}

}
