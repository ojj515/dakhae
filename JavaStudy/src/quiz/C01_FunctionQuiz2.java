package quiz;

public class C01_FunctionQuiz2 {

	
	// 1 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	
	public static char[] shuffle (String text) {
		
		char [] str = new char[text.length()];
		
		for(int i = 0; i < text.length(); ++i) {
			str[i] = text.charAt(i);
		}
		for(int i = 0; i < 1000; ++i) {
			int randomIndex = (int)(Math.random() * (str.length - 1) + 1);
			
			char temp= str[0];
			str[0] = str[randomIndex];
			str[randomIndex] = temp;
		}
		return str;
	}
		
	
	// 2 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
	
	public static String reverse (String text) {
				
		String answer = "";
		for(int i = text.length() - 1; i >= 0; --i) {
			answer += text.charAt(i);
			
		}
		return answer;

	}		
				
	// 3 문자열을 전달하면 해당 문자열의 좌우대칭 여부를 반환하는 함수

	public static boolean symmetry(String text) {
		
		int len = text.length();
		int half = len / 2;
		
		for(int i = 0; i < half; ++i) {
			
			char ch1 = text.charAt(i);
			char ch2 = text.charAt(len - 1 - i);
			
			if(ch1 != ch2) {
				return false;
			}
		}
		return true;
	}
	
	// 4 함수를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	

		
	
	
	

	public static void main(String[] args) {

	System.out.println(shuffle("안녕하신가요"));
	System.out.println(reverse("안녕하신가요"));
	System.out.println(symmetry("ABBABA"));
		
	}

}


