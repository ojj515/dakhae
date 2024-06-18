package quiz;

import java.util.Scanner;

public class D09_isPhoneNumber {
	/*
	 *  전달받은 문자열이 올바른 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	 * 
	 */
	public static boolean isValidPhoneNumber(String phoneNumber) {
		// 외곽의 공백은 허용해주겠다
		phoneNumber = phoneNumber.trim();
		
		// 숫자와 -만으로 이루어진 문자열인가
		int len = phoneNumber.length();
		for(int i = 0; i < len; ++i) {
			char ch = phoneNumber.charAt(i);
			
			if (ch != '-' && (ch < '0' || ch > '9')) {
				System.out.println("[System] - 또는 숫자가 아닌 문자가 포함되어 있습니다.");
				return false;
			}
		}
		// -가 포함된 번호인 경우 길이가 13이어야 하고 -의 위치도 검사해야 한다
		if(phoneNumber.contains("-")) {
			if (phoneNumber.length() != 13) {
			System.out.println("[System] - 번호의 길이가 잘못되었습니다");
			return false;
			} else if (phoneNumber.indexOf('-') != 3 ||
					phoneNumber.lastIndexOf('-') != 8) {
				System.out.println("[System] -의 위치가 잘못되었습니다");
				return false;
			}
		}
		
		// 모든 -를 제거한다
		
		phoneNumber = phoneNumber.replace("-", "");
		
		if(phoneNumber.length() != 11) {
			System.out.println("[System] 숫자의 갯수가 잘못되었습니다");
			return false;
		}
		
		if(!phoneNumber.startsWith("010")) {
			System.out.println("[System] 번호가 010으로 시작하지 않습니다");
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String ph = "010-1235-1234";
		System.out.println(isValidPhoneNumber(ph));
	}	

	
}


