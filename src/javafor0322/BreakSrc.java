package javafor0322;

import java.util.Scanner;


public class BreakSrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();//���� ������ ����
//			String text = scanner.next();// ���� �ȸ���
			if(text.equals("exit"))
				break;	
		}
			System.out.print("���α׷��� �����մϴ�.");
			scanner.close();
	}

}
