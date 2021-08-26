
public class Quiz17 {

	public static void main(String[] args) {
		/*
		 * 		별 찍 기
		 * 		*****
		 * 		****
		 * 		***
		 * 		**
		 * 		*
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
