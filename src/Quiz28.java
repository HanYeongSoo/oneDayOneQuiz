
public class Quiz28 {

	public static void main(String[] args) {
		/*
		 * 		10진수를 2 ~ 16진수 사이 아무거나 변환하기
		 */
		
		char n [] = new char [100];
		
		int num = 19;
		int num2 = 10;
		
		int i = 0;
		while(num > 0) {
			int tmp = num % num2;
			
			if (tmp >= 10 && tmp <=15) {
				n[i] = (char) ('A' + (tmp-10));
			} else {
				n[i] = (char) ('0' + tmp);
			}
			num /= num2;
			i++;
		}
		
		for ( ; i >= 0 ; i--) {
			System.out.print(n[i]);
		}
	}

}
