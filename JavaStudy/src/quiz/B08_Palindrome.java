package quiz;

import java.util.Scanner;

public class B08_Palindrome {

	/* 
	 *  사용자가 단어를 입력하면
	 *  해당 단어가 좌우대칭을 이러는 단어인지 판별해주는 프로그램을 만들어보세요
	 *  
	 *  	0 == len - 1
	 *  	1 == len - 1 - 1
	 *  	2 == len - 1 - 2
	 *  
	 *  >> LEVEL
	 *  -> 좌우대칭입니다
	 *  
	 *  >> Apple
	 *  -> 좌우대칭입 아닙니다
	 *  
	 *  >> BOB
	 *  -> 좌우대칭입니다
	 *  
	 *  >> ABBA
	 *  -> 좌우대칭dl 아닙니다
	 *  
	 */
	public static void main(String[] args) {
		
		String word = "ABBBBBBBA";
		
		int len = word.length();
		int half = len / 2;
		
		// 좌우대칭 여부를 저장해놓을 변수
		boolean isPalindrome = true;
		
		for(int i = 0; i < half; ++i) {
//			System.out.printf("%c vs %c\n",
//					word.charAt(i), word.charAt(len - 1 - i));
			
			// i	ch1		ch2
			//------------------
			// 0 	0		len - 1 - 0
			// 1	1		len - 2
			// 2	2		len - 3
			//
			
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(len - 1 - i);
			
//			if(ch1 == ch2) {
//				System.out.printf("%d번째 검사결과: 같음\n" , i);
//			} else {
//				System.out.printf("%d번째 검사결과: 다름\n" , i);
			
			if(ch1 != ch2) {
				isPalindrome = false;
			
			}
			
		}
		
		if (isPalindrome) {
			System.out.println("\"" + word + "\"는 좌우대칭입니다");
		} else {
			System.out.println("\"" + word + "\"는 좌우대칭이 아닙니다");
		}
	
			
	} 
			

	
}
