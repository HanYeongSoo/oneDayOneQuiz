
public class Quiz18 {

	public static void main(String[] args) {
		/*
		 * 		별 찍 기
		 * 		    *
		 * 		   **
		 * 		  ***
		 * 		 ****
		 * 		*****
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				if (i < 5 - (j+1)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
