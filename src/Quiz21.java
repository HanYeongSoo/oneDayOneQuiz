
public class Quiz21 {

	public static void main(String[] args) {
		/*
		 * 		1 - 100 사이의 숫자 중 중복되 ㄴ숫자 한번만 출력
		 * 		입력 : 1 2 3 1 1 2 3 4 5 5
		 * 		출력 : 1 2 3 4 5
		 */
		boolean arr2 [] = new boolean [100];
		int arr [] = new int [100];
		
		arr[0] = 2;
		arr[1] = 2;
		arr[2] = 1;
		arr[3] = 5;
		arr[4] = 3;
		arr[5] = 6;
		arr[6] = 12;
		arr[7] = 1;
		arr[8] = 1;
		arr[9] = 9;
		arr[10] = 4;
		
		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
			arr2[arr[i]] = true;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr2[i] == true) {
				System.out.print(i + " ");
			}
		}
	}

}
