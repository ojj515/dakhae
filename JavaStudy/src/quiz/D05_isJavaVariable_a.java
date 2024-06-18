package quiz;

import java.util.Scanner;

import javax.lang.model.SourceVersion;

public class D05_isJavaVariable_a {
	/*
	 * 
	 * 사용자로부터 문자열을 입력받으면
	 * 해당 문자열이 자바의 변수로 사용할 수 있는 문자열인지 검사해보세요
	 * 
	 */
	
	public static boolean isJavaVariable(String str) {
		// 전달받은 문자열을 다루기 편한 char[]로 변환하겠다
		char[] arr = str.toCharArray();
		// 첫번째 글자가 자바의 변수명으로 적합하지 않으면
		if(!Character.isJavaIdentifierStart(arr[0])) {
		// 메서드를 종료하고 false를 리턴하겠다	
			return false;
		}
		// 두번째 글자부터는 Character.isJavaIdentifierPart() 메서드로 확인한다
 		for(int i = 1; i <arr.length; ++i) {
			if(!Character.isJavaIdentifierPart(arr[1])) {
				return false;
			}
		}
		
		// 여기까지 도착하면 true를 반환한다
		return true;
	}
	
	
	public static void main(String[] args) {
		// SourceVersion.isKeyword(str): 
		// 전달한 문자열이 자바의 예약어인지 확인해주는 메서드
		SourceVersion.isKeyword("");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(">> ");
			String str = sc.nextLine();
			
			if (SourceVersion.isKeyword(str)) {
				System.out.println(str + "는 자바의 예약어입니다. "
						+ "변수로 사용할 수 없습니다.");
				continue;
			}
			
			boolean result = isJavaVariable(str);
			
			System.out.println(result ?
						str + "은 자바변수로 적합합니다." :
						str + "은 자바 변수로는 부적합합니다.");
		}
	}
}
