package quiz;

public class B12_TempPassword {

	public static void main(String[] args) {
	
		for(int i = 0; i < 20; ++i) {
			String password = "";
			for(int keyLen = 0; keyLen < 6; ++keyLen) {
				password += (char)(Math.random() * 26 + 65);
			}
			System.out.println(i +"번째 비밀번호: " + password);
		}
			
			
		
		
	}
	
	
	
	
}
