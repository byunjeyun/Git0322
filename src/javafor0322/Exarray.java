package javafor0322;


import java.util.*;

public class Exarray {

	enum Week {월, 화, 수, 목, 금, 토, 일}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num[]= {1, 2, 3, 4, 5};
		String names[]= {"사과","배", "바나나", "체리", "딸기", "포도"};
		
		int sum=0;
		for(int k:num) {
			System.out.print(k + " ");
			sum+=k;
		}
		System.out.println("배열값의 합은"+ sum );
		
		
		for (String s : names) {
			System.out.print(s+ " ");
		}
			System.out.println();
		
		for (Week day : Week.values()) {
			System.out.print(day+ "요일 ");
		}
			System.out.println();
		
	}

}
