package javafor0322;

import java.util.*;

public class Array0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	
//	int Array[] = new int[5];
	
	int Array[];
	Array = new int[4];
	int max=0;
	int sum=0;
	int count=0;
	
	System.out.println("��� 5���� �Է��ϼ���");
	
	for(int i=0; i<5; i++) {
		Array[i] = scanner.nextInt();
		if(Array[i]>max)
			max=Array[i];
		sum+=Array[i];
		count++;
	}
	
	System.out.println("���� ū����" +max+"�Դϴ�");
	System.out.println("�Է°��� ����" +sum+"�Դϴ�");
	System.out.println("�����" +(double)sum/count+"�Դϴ�");
	scanner.close();
		
	}

}
