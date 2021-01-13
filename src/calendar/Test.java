package calendar;

import java.util.Scanner;

public class Test {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
	
	public static int getMaxDayOfMonth(int month) {
		return MAX_DAYS[month-1];
	}

	public static void main(String[] args) {
		/*
		 * 입력 및 출력 예시
			반복횟수를 입력하세요.
			3 (엔터)

			월을 입력하세요.
			1
			2
			3

			1월은 31일까지 있습니다.
			2월은 28일까지 있습니다.
			3월은 31일까지 있습니다.

		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("반복횟수를 입력하세요.");
		int count = scan.nextInt();
		int[] monthArr = new int[count];
		
		System.out.println("");
		System.out.println("월을 입력하세요.");

		for(int i=0; i <count; i++) {
			monthArr[i] = scan.nextInt();
		}
		
		System.out.println();
		for(int i=0; i <count; i++) {
			System.out.println(monthArr[i] + "월은 " + getMaxDayOfMonth(monthArr[i]) +"일까지 있습니다.");
		}
		
		scan.close();
					
	}

}
