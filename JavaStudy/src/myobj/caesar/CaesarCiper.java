package myobj.caesar;

public class CaesarCiper {

	final static String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+abcdefghijklmnopqrstuvwxyz{}[]|\\;:'\"/?<>,.";
	
	String password;
	
	public CaesarCiper(String password) {
		this.password = password;
	}

	public void typePassword() {
		
		int a1 = word.length();
		int a2 = password.length();
		
		for(int i = 0; i < a1; ++i) {
			for(int j = 0; j < a2; ++j) {
				
			}
		}
		
	}
	
}

