package quiz;

/*
 *  대문자, 소문자, 특수문자, 숫자로 구성된
 * 	6자리 랜덤 비밀번호를 20개 생성하여 출력하는 프로그램을 만들어보세요
 * 
 * # 비밀번호로 사용 가능한 특수문자의 아스키코드 범위 33~47
 */
public class B12_TempPassword2 {
	
	public static void main(String[] args) {
		
		String password = "";
		
		for(int i = 0; i < 20; ++i) {
			for(int keyLen = 0; keyLen < 6; ++keyLen) {
				
				int pwd = (int)((Math.random() * 90) + 33);
				if (pwd <= 58 && pwd >= 64) {
					continue;
				} else if (pwd <= 91 && pwd >= 96) {
					continue;
				} else {
					password += (char)pwd;
				}
			}
			System.out.println(i +"번째 비밀번호: " + password);
			password = "";
		}
		
		
	}

}
