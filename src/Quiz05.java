
public class Quiz05 {

	public static void main(String[] args) {
		/*
		 * 		대문자는 소문자로 소문자는 대문자로 바꾸기
		 */
		
		char [ ] arr = {'h','e','l','l','o','W','o','r','l','D'};
		
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			if (arr[i] > 'A' && arr[i] < 'Z')  {
				arr[i] = (char)(arr[i]+32);
//				System.out.println((char)(arr[i] + 32));
			} else {
				arr[i] = (char)(arr[i]-32);
//				System.out.println((char)(arr[i] -32));
			}
		}
		System.out.println(arr);
	}

}
