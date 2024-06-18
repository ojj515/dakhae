package quiz;

import java.util.Scanner;

public class B00_AgeCalculator {
	
	public static void main(String[] args) {

		/* 이름과 태어난 년도를 입력하면 이름과 나이를 출력해주는 프로그램을 만들어보세요
		 * 
		 * ex) 김동우 1997
		 * 	   김동우 (28)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 > ");
		
		String text = sc.nextLine();
		System.out.printf("%s\n" , text);
		
		System.out.println("출생년도를 입력해주세요 > ");
		int num = sc.nextInt();
		// System.out.printf("%s\n" , text + "("+ (2024 - num) + "세)"); 나의 실수
		System.out.printf("%s(%d세)\n", text, 2025 - num);
		
		
		
		
		
		
	}
		
}