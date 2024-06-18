package myobj.isPhoneNumber;

public class PhoneNumber {

	String phoneNum;
	
	
	
	public PhoneNumber() {
		this.phoneNum = phoneNum;
	}
	
	public void typePhoneNum(String phoneNum) {
		
		if(phoneNum.charAt(0) != '0' || phoneNum.charAt(1) != '1' || 
				 phoneNum.charAt(2) != '0') {
			System.out.println("앞자리 숫자를 제대로 입력해주세요!");
		} else if(phoneNum.length() != 13) {
			System.out.println("전화번호가 올바른 형태가 아닙니다");
		} else {
			System.out.println("올바른 전화번호입니다");
		} 
		
	}
	
	// 010-2684-9248
	
}
