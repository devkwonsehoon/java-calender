package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		// 출력 예제
//		System.out.println(" 일 월 화 수 목 금 토");
//		System.out.println("--------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");

		// 두 수를 입력받아 합을 출력해보자. 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다." );		
		scanner.close();
		
	}

}
