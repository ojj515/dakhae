package quiz;

import java.util.Scanner;

public class B08_CountE {

	/*
	 *  사용자가 문장을 입력한 해당 문장에 포함된
	 *  알파벳 e의 개수를 출력하는 프로그램을 만들어 보세요)
	 *  (대/ 소문자 모두 개수에 포함)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력해주세요 >> ");
		
		String word = sc.next();
		int wordlength = word.length();
		int cnt = 0;
		
		
		for (int i = 0; i < wordlength; ++i ) {
			if(word.charAt(i) == 'e') {
				++cnt;	
			} else if(word.charAt(i) == 'E') {
				++cnt;
			}	
	
		}
		System.out.printf("문장 안의 e의 개수는 %d개입니다", cnt);
		

		

	}
}
