package javafor0322;


import java.util.*;

public class Exarray {

	enum Week {��, ȭ, ��, ��, ��, ��, ��}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num[]= {1, 2, 3, 4, 5};
		String names[]= {"���","��", "�ٳ���", "ü��", "����", "����"};
		
		int sum=0;
		for(int k:num) {
			System.out.print(k + " ");
			sum+=k;
		}
		System.out.println("�迭���� ����"+ sum );
		
		
		for (String s : names) {
			System.out.print(s+ " ");
		}
			System.out.println();
		
		for (Week day : Week.values()) {
			System.out.print(day+ "���� ");
		}
			System.out.println();
		
	}

}
