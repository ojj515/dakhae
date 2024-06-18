package quiz;

import java.util.Scanner;

public class D05_isJavaVariable {
	/*
	 * 
	 * 사용자로부터 문자열을 입력받으면
	 * 해당 문자열이 자바의 변수로 사용할 수 있는 문자열인지 검사해보세요
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요 >> ");
		String type = sc.nextLine();
		boolean result = false;
		
		for(int i = 0; i < type.length(); ++i) {
			char str = type.charAt(i);
			if(Character.isJavaIdentifierPart(str)){
				result = true;
			} else {
				result = false;
			}
		}
		if(result) {
			System.out.println("변수로 활용될 수 있습니다!");
		} else {
			System.out.println("변수로 활용될 수 없습니다...");
		}
		
	}
}
