import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		 * 		�л��������� �����ϰ�, �л��̸����� �˻����� �� �й��� ����ϴ� ���α׷� �ۼ�
		 * 		Student Ŭ���� ����
		 * 		String name , no�� ���� (�̸��� �й�)
		 * 		
		 * 		�л����� ArrayList�� ������ �� ��� �˻��ϰڳ� > y �ݺ�
		 * 		�����ϰ� ������ > n ����
		 * 		
		 * 		�л��̸��� ���� �� �� �л��� �й��� ���
		 * 		���� �� ���� �л��̶�� ���
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		ArrayList name = new ArrayList();
		ArrayList no = new ArrayList();
		
		String num = " ";
		String inputName = " ";
		
		name.add("�����");
		name.add("�ѿ���");
		no.add(111);
		no.add(222);
		
//		System.out.println(name.indexOf("�����"));
//		System.out.println(name);
//		System.out.println(no);
		
		while (true) {
			System.out.print("�˻��Ͻðڽ��ϱ�? ? ");
			num = input.next();
			
			switch (num) {
			case "y":
				if (name.indexOf(name) == -1) {
					System.out.print("�̸��� �˻��� �ּ���. ");
					inputName = input.next();
					if (inputName.equals(name.get(0))) {
						System.out.println("�� �л��� ��ȣ�� " + no.get(0));
					} else {
						System.out.println("�� �л��� ��ȣ�� " + no.get(1));
					}
				} else {
					System.out.println("���� �̸��Դϴ�.");
				}
				break;
			case "n":
				System.out.println("�����մϴ�.");
				System.exit(0);
				break;

			}
		}
	
		
	}

}
