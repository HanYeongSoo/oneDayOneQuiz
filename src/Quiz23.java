
public class Quiz23 {

	public static void main(String[] args) {
		/*
		 *		입력된 문자열을 뒤집어서 출력하시오. 
		 *
		 *		모르겠습니다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 *		모르겠습니다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 *		모르겠습니다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		 */
		
		String s = "ABCDE";
		char c [] = s.toCharArray();
		System.out.println(c);
		char tmp;

		int count =  c.length;
		
		for (int i = 0; i < count / 2; i++) {
			tmp = c[i];
			c[i] = c[count - i - 1];
			c[count - i - 1] = tmp;
		}
		s =  new String(c);
		System.out.println(s);
		
	}

}
