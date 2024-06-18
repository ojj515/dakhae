package quiz;

import java.util.Scanner;

public class B07_ForQuiz3 {

	public static void main(String[] args) {

		/*
		 * 사용자로부터 숫자를 입력받으면 0부터 해당 숫자 사이에 존재하는 모듭 3의 배수를 한 줄에 6개씩 출력해 보세요 (단, 음수를 입력받는
		 * 경우에도 올바르게 동작해야함
		 * 
		 */

/*		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요 >> ");
		int num1 = sc.nextInt();
		
		for(int num = 0, crt = 0; num <= num1; ++num) {
			if(num % 3 == 0) {
				System.out.printf("%6d", num);
			} else {
				System.out.printf("-%6d", num);
			}
				++crt;
			
				if (crt % 6 == 0) {
				System.out.println();
				
				}
				
*/			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("목표 숫자: ");
		int target = sc.nextInt();
		int absValue = Math.abs(target);
		
		for(int i = 0, cnt = 0; i <= absValue; ++i) {
			if (i % 3 == 0) {
				if (target < 0) {
					System.out.printf("%d\t", -i);
				} else {
					System.out.printf("%d\t", i);
				}
					// 정수와 문자타입을 더하면 문자코드 값과 정수값을 더해버린다
					// 문자타입도 이어붙이기를 하기 위해서는 문자열과의 +가 필요하다
				}	
				
				if (++cnt % 6 == 0) {
					System.out.println();
				}
					
			}
		}
		
}
