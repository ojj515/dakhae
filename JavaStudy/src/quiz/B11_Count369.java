package quiz;

import java.util.Scanner;

public class B11_Count369 {

	/* 사용자가 숫자를 일력하면
	 * 해당 숫자까지 369게임이 진행됐을 때 박수를 총 몇번 치는가
	 * 
	 * 
	 * 1. 숫자를 문자열로 취급하여 검사하는 방식
	 * 
	 * 2. 그냥 숫자로 검사하는 방식 
	 *  
	 */
	
	public static void main(String[] args) {
		boolean DEBUG_MODE = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 >> ");
		int targetNum = sc.nextInt();
		int totalClapCount = 0;
		
		for(int i = 1; i <= targetNum; ++i) {
			if (DEBUG_MODE) {
				System.out.print(i + "\t: ");
			}
			
			String numStr = "" + i;
			
			int len = numStr.length();
			for (int index = 0; index < len; ++index) {
				char ch = numStr.charAt(index);
				if(ch == '3' || ch == '6' || ch == '9') {
					++totalClapCount;
					System.out.print("짝");
				}
 			}
			if (DEBUG_MODE) {
			System.out.println();
			}
		}

		System.out.printf("%d까지 369를 진행하면 박수를 총 %d번 쳐야합니다.\n",
				targetNum, totalClapCount);
		
	}
}
