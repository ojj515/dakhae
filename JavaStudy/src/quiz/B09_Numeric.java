package quiz;

import java.util.Scanner;

public class B09_Numeric {
	
	/*
	 *  사용자가 입력한 문자열이 숫자로만 이루어 졌는가
	 */
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아무거나 입력 >> ");
		String text = sc.nextLine();
		
		int len = text.length();
		
		boolean onlynum = true;
		
		// (1) 모든 문자가 숫자인지 검사하는 방식, 검사를 문자열 길이만큼 해야 한다.
//		for (int i = 0; i< len; ++i) {
//			char ch = text.charAt(i);
//			
//			if (ch >= '0' && ch <= '9') {
//				onlynum &= true;	
//			} else {
//				onlynum &= false;
//			}
//		
//		System.out.println("숫자로만 이루어졌나요?" + onlynum);
		
		//(2) 숫자가 아닌 문자가 등장하면 바로 검사를 중단하는 방식
		for (int i = 0; i< len; ++i) {
			char ch = text.charAt(i);
			
			if(ch < '0' || ch > '9') {
				onlynum = false;
				break;
			}
			
		}
		System.out.println("숫자로만 이루어졌나요?" + onlynum);
	}
}
