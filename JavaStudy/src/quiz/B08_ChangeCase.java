package quiz;

import java.util.Scanner;

public class B08_ChangeCase {

	
	/*
	 * 사용자가 영어로 된 문장을 입력하면 대소문자를
	 * 반대로 바꿔서 출력하는 프로그램을 만들어 보세요
	 * 
	 * 입력> I Like To Try Apple
	 * 출력> i lIKE tO tRY aPPLE
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text = "I Like To Try Apple";
		
		int len = text.length();
		int diff = Math.abs('A' - 'a');
		
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				System.out.print((char)(ch - 'a' + 'A'));
				// System.out.print((char)(ch - diff));
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.print((char)(ch - 'A' + 'A'));
				// System.out.print((char)(ch + diff));
			} else {
				System.out.println(ch);
			}
				
			
			
				
		}
		
	}
	
}
