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
	
	System.out.println("양수 5개를 입력하세요");
	
	for(int i=0; i<5; i++) {
		Array[i] = scanner.nextInt();
		if(Array[i]>max)
			max=Array[i];
		sum+=Array[i];
		count++;
	}
	
	System.out.println("가장 큰수는" +max+"입니다");
	System.out.println("입력값의 합은" +sum+"입니다");
	System.out.println("평균은" +(double)sum/count+"입니다");
	scanner.close();
		
	}

}
