package javafor0322;

import java.util.*;

public class Array0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	
	int intArray[] = new int[5];
	int max=0;
	double ave;
	int sum=0;
	int count=0;
	
	System.out.println("��� 5���� �Է��ϼ���");
	
	for(int i=0; i<5; i++) {
		intArray[i] = scanner.nextInt();
		if(intArray[i]>max)
			max=intArray[i];
		sum+=intArray[i];
		count++;
	}
	
	System.out.println("���� ū����" +max+"�Դϴ�");
	System.out.println("�Է°��� ����" +sum+"�Դϴ�");
	System.out.println("�����" +(double)sum/count+"�Դϴ�");
	scanner.close();
		
	}

}
