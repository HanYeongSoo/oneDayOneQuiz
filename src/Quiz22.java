
public class Quiz22 {

	public static void main(String[] args) {
		
		String s = "12321";
		boolean bool = true;
		
		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i));
			
			if (s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3)) {
				bool = true;
			} else {
				bool = false;
			}
		}
		System.out.println(true);
		
		String n = "122221";
		int count = n.length();
		
		for (int i = 0; i < count / 2; i++) {
			if (n.charAt(i) != n.charAt(count - i - 1)) {
				bool = false;
			}
		}
		System.out.println(bool);
		
		
	}

}
