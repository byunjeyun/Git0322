package javafor0322;

import java.util.Scanner;

public class WhileSrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
				
		int n = scanner.nextInt();
		while(n!=-1) {
			sum+=n;
			count++ ;
			n=scanner.nextInt();
		}
		if(count ==0) System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.print("������ ������" + count +"�� �̸�");
			System.out.print("�����"+(double)sum/count+"�Դϴ�.");
		}
		scanner.close();
	}

}
