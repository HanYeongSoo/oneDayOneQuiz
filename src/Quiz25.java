
public class Quiz25 {

	public static void main(String[] args) {
		/*
		 * 		n이 주어졌을 때, n의 사이클의 길이를 구하시오 (1 <= n <= 100)
		 * 		ex ) 26을 입력
		 * 		정답은 4 ( 26시작 > 2+6 =8 >> 68 6+8 >> 14 >> 84 >> 12 >> 42 4+2 >> 6 >>26)
		 */
		
//		int n = 26;
//		int m = n;
//		int o = 0;
//		int count = 0;
//			
//		for (int i = 1; i <= 100; i++) {
//			o = (n / 10) + (n * 10);
//			m = (n % 10) * 10 + (o % 10); 
//			count++;
//		}	
//		if (n != m) {
//			System.out.println(count);
//		}
		
		System.out.println("do -while 이 뭐야@@@@@@@@@@@@@@@");
		System.out.println("======================================");
		
		int n =26;
		int res = n;
		int tmp = 0;
		int cnt = 0;
		
		do {
			tmp = res / 10 + res % 10;
			res = res % 10 * 10 + tmp % 10;
			cnt++;
		}  while (n != res);
		
		System.out.println(cnt);
	}

}
