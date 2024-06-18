package quiz;

import java.util.Scanner;

public class B04_AppleQuiz {

	/*
	 * 사과를 10개씩 담을 수 있는 바구니가 있다
	 * 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
	 * 바구니의 개수를 알려주는 프로그램을 만들어보세요
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과 갯수를 입력해주세요 >> ");
		
		int apple = sc.nextInt();
		int basket = apple / 10;
		
		if (apple % 10 <= 0) {
			System.out.printf("필요하신 바구니 개수는 %d개 입니다", basket);
		} else if (apple % 10 == 0) {
			System.out.printf("필요하신 바구니 개수는 %d개 입니다", basket);
		} else if (apple % 10 != 0) {
			System.out.printf("필요하신 바구니 개수는 %d개 입니다", basket);
		} 
		
		
	}
	
}
