package quiz;

import java.util.Scanner;

public class B00_WonToDollar_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("KRW > ");
		int krw = sc.nextInt();
		
		// 1달러 당 1373.55원
		double ExchangeRate = 1373.55;
		
		double usd = krw / ExchangeRate;
		
		System.out.printf("%dKRW은 %.2fUSD입니다.\n", krw, usd);
				
		
		
	}
}
