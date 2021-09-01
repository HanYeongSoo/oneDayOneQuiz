
public class Quiz20 {
	
	public static int getNum (int i) {
		int j = 0;
		
		while (i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ) 
				j++;
				i /= 10;
			
		}
		
		return j;
	}

	public static void main(String[] args) {
		/*
		 * 		3  6  9 게임~~ 100까지 
		 * 		1 2 짝 4 5 짝 ....  짝 짝 짝짝 100
		 */
		
//		int num = 100;
//		
//		for (int i = 1; i <= num; i++) {
//			if (i % 3 == 0 || i % 6 == 0 || i % 9 == 0) {
//				if (i == 33 ) {
//					System.out.println(i);
//				}
//				System.out.println(i + "짝");	
//			}
//		}
		
		int n = 100;
		
		for (int i = 1; i <= n; i++) {
			int cnt = getNum(i);
			
			if (cnt == 0) {
				System.out.print(i + " ");
			} else {
					for(int l = 0; l < cnt; l++ ) {
						System.out.print("짝");
					}
					System.out.print(" ");
			}
		}
		
	}

}
