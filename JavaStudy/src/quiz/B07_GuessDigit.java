package quiz;

import java.util.Scanner;

public class B07_GuessDigit {
		
	/*
	 * 사용자가 int 타입 값을 입력하면 해당 숫자가 몇 자리 숫자인지
	 * 알려주는 프로그램을 만들어보세요 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 보세요 >> ");
		int num = sc.nextInt();

		System.out.println((int)(Math.log10(num)) + 1);
		
//		int cnt;
//		for (cnt = 0; num > 0; num /= 10) {
//			++cnt;
//		}
//		System.out.println(cnt + "자리 숫자입니다");
		
		
		// 2. 원시적인 생각을 잘 밀어붙이 결과
//		int cnt = 1;
//		for (int compare = 10; compare <= num; compare *= 10) {
//			++cnt;		
//		}
//		
//		System.out.println(cnt + "자리 입니다.");
		
/*	if (target < 10) {
				System.out.printf("입력하신 숫자 %d는 첫째 자리 수입니다", num);
			} else if (target >= 10 && target < 100) {
				System.out.printf("입력하신 숫자 %d는 둘째 자리 수입니다", num);
			} else if (target >= 100 && target < 1000) {
				System.out.printf("입력하신 숫자 %d는 셋째 자리 수입니다", num);
			} else if (target >= 1000 && target < 10000) {	
				System.out.printf("입력하신 숫자 %d는 넷째 자리 수입니다", num);
			} else if (target >= 10000 && target < 100000) {	
				System.out.printf("입력하신 숫자 %d는 다섯째 자리 수입니다", num);
			} else if (target >= 100000 && target < 1000000) {	
				System.out.printf("입력하신 숫자 %d는 여섯째 자리 수입니다", num);
			} else if (target >= 1000000 && target < 10000000) {	
				System.out.printf("입력하신 숫자 %d는 일곱째 자리 수입니다", num);
			} else if (target >= 10000000 && target < 100000000) {	
				System.out.printf("입력하신 숫자 %d는 여덜번째 자리 수입니다", num);
			} else if (target >= 100000000 && target < 1000000000) {	
				System.out.printf("입력하신 숫자 %d는 아홉번째 자리 수입니다", num);
			} else if (target >= 1000000000 && target <= 2147483647) {	
				System.out.printf("입력하신 숫자 %d는 열번째 자리 수입니다", num);

*/			
				
	}
}


