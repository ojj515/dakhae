package quiz;

public class C00_FunctionQuiz {

	
	// 1. 전달한 문자가 알파벳이면 true, 아니면 false를 반환하는 함수
	
	public static boolean alpabet(char chat) {
		
		if (chat >= 'a' && chat <= 'z') {
			return true;
		} else if (chat >= 'A' && chat <= 'Z') {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean drainage (int num) {
		
		if (num % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String oddnumber (int num) {
		
		if (num % 2 == 0) {
			return "짝수입니다";
		} else {
			return "홀수입니다";
		}
		
		
	}
	
	public static int measure (int num) {
		
		int cnt = 0;
		
		for(int i = 0; i < num; ++i) {
			if(num % i == 0) {
				++cnt;
			}
			
		}
		return cnt;		
			
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println(alpabet('1'));
		System.out.println(drainage(67));
		System.out.println(oddnumber(67));
		System.out.println(measure(13));
		
	}

}
