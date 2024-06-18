package quiz;

import java.util.Scanner;

public class B00_WonToDollar {

	/*
	 * 한국돈을 입력하면 달러로 얼마일지 계산하는 프로그램
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한국 돈을 입력 >> ");
		
		int won = sc.nextInt();
		
		double dollar = 0.00073;
		double result = won * dollar;
		
		System.out.printf("%.2f", result);
		

		
		
	}
}
