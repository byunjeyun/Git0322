package javafor0322;

import java.util.Scanner;


public class BreakSrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();//띄어쓰기 영역도 포함
//			String text = scanner.next();// 띄어쓰기 안먹힘
			if(text.equals("exit"))
				break;	
		}
			System.out.print("프로그램을 종료합니다.");
			scanner.close();
	}

}
