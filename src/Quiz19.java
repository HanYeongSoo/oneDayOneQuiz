
public class Quiz19 {

	public static void main(String[] args) {
		/*
		 *		거듭제곱을 구하여라
		 *		입력 값 5 , 3 이면 125 나오게 
		 */
		
		int n = 5;
		int n2 = 3;
		
		int count = 1;
		
		for (int i = 0; i < n2; i++) {
			count *= n;
		}
		System.out.println(count);
	}

}
