import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		 * 		학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성
		 * 		Student 클래스 생성
		 * 		String name , no를 가짐 (이름과 학번)
		 * 		
		 * 		학생들을 ArrayList에 저장한 후 계속 검색하겠냐 > y 반복
		 * 		종료하고 싶으면 > n 종료
		 * 		
		 * 		학생이름이 있을 시 그 학생의 학번을 출력
		 * 		없을 시 없는 학생이라고 출력
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		ArrayList name = new ArrayList();
		ArrayList no = new ArrayList();
		
		String num = " ";
		String inputName = " ";
		
		name.add("지명근");
		name.add("한영수");
		no.add(111);
		no.add(222);
		
//		System.out.println(name.indexOf("지명근"));
//		System.out.println(name);
//		System.out.println(no);
		
		while (true) {
			System.out.print("검색하시겠습니까? ? ");
			num = input.next();
			
			switch (num) {
			case "y":
				if (name.indexOf(name) == -1) {
					System.out.print("이름을 검색해 주세요. ");
					inputName = input.next();
					if (inputName.equals(name.get(0))) {
						System.out.println("그 학생의 번호는 " + no.get(0));
					} else {
						System.out.println("그 학생의 번호는 " + no.get(1));
					}
				} else {
					System.out.println("없는 이름입니다.");
				}
				break;
			case "n":
				System.out.println("종료합니다.");
				System.exit(0);
				break;

			}
		}
	
		
	}

}
