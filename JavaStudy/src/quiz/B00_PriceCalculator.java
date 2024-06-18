package quiz;

import java.util.Scanner;

public class B00_PriceCalculator {

	// 4가지 음류수 개수를 입력하면 총 가격을 출력해보세요
	// (음류수 가격은 2300, 2800, 3300, 3500)
	//  ex) 0 5 0 1
	//      15000

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음류수 개수를 입력하세요 >> ");
		
		int amount1 = sc.nextInt();
		int price1 = 2300;
		int total1 = amount1 * price1;
		
		int amount2 = sc.nextInt();
		int price2 = 2800;
		int total2 = amount2 * price2;
		
		int amount3 = sc.nextInt();
		int price3 = 3300;
		int total3 = amount3 * price3;
		
		int amount4 = sc.nextInt();
		int price4 = 3500;
		int total4 = amount4 * price4;
		
		System.out.printf("주문하신 총 금액은 %d원입니다\n", total1 + total2 + total3 + total4);
		
		
		
	}
	
	
}
