
public class Quiz26 {

	public static void main(String[] args) {
		/*
		 * 		734 893 = 437 398 로 읽고 더 큰수를 437로 인식
		 * 		즉 734 893 을 입력하면 출력값은 437이 나와야 함
		 */
		
		int a = 734;
		int b = 893;
		
//		내 풀이@@@@@@@@@@@@@@@@@@@@@@@@
//		int arr [] = new int [3];
//		arr[0] = a % 10;
//		a = a /10;
//		System.out.println(arr[0]);
//		arr[1] = a % 10;
//		a = a / 10;
//		System.out.println(arr[1]);
//		arr[2] = a % 10;
//		a = a / 10;
//		System.out.println(arr[2]);
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int arr2 [] = new int [3];
//		arr2[0] = b % 10;
//		b = b /10;
//		System.out.println(arr2[0]);
//		arr2[1] = b % 10;
//		b = b / 10;
//		System.out.println(arr2[1]);
//		arr2[2] = b % 10;
//		b = b / 10;
//		System.out.println(arr2[2]);
//		
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			if (arr[i] > arr2[i]) {
//				System.out.println(arr[i]);
//			} else {
//				System.out.println(arr2[i]);
//			}
//		}
//		내 풀이@@@@@@@@@@@@@@@@@@@@@@@@
		
		int arrA[] = new int [3];
		int arrB[] = new int [3];
		
		int countA = 0;
		do {
			arrA[countA] = a % 10;
			a /= 10;
			countA++;
		}	while(a > 0);
		
		int reverseA = 0;
		int x = 1;
		for (int i = arrA.length-1; i >= 0; i--) {
			reverseA += arrA[i] * x;
			x *= 10;
		}
		System.out.println("a의 반대 수 : " + reverseA);
		
		
		int countB = 0;
		do {
			arrB[countB] = b % 10;
			b /= 10;
			countB++;
		} 	while(b > 0);
		
		int reverseB = 0;
		x =1;
		for (int i = arrB.length - 1; i >= 0; i--) {
			reverseB += arrB[i] * x;
			x *= 10;
		}
		System.out.println("b의 반대 수 : " + reverseB);
	}

}
