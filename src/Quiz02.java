
public class Quiz02 {

	public static void main(String[] args) {
		/*
		 * 		�Ǻ���ġ ������ ����ض�
		 * 		An = An -1 + An -2 
		 * 		1 1 2 3 5 8 13 21 34....
		 */
		int arr [ ] = new int [20];
		int sum = 0;
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			sum = arr[i];
			System.out.print(sum + "\t");
		}
		
	}

}
