package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E02_CorrectNumber {

	/*
	 *  예외처리 방식을 사용하여 다음을 구현하세요
	 * 
	 * 1. 사용자가 중복없는 4개의 숫자를 한 글자씩 입력해야 한다
	 * 
	 * 2. 사용자가 입력한 숫자가 0 ~ 9 사이의 숫자가 아닌경우 예외가 발생해야 한다
	 * 
	 * 3. 사용자가 입력한 숫자가 이미 입력했던 숫자인 경우 예외가 발생해야 한다
	 * 
	 * 4. 숫자 4개를 모두 입력하고 나면 입력했던 숫자를 다시 한번 하나씩 입력하여 확인해야 한다
	 * 
	 * 5. 사용자가 입력했던 숫자와 이번에 입력한 숫자가 다르다면 예외가 발생해야 한다
	 * 
	 */
	
	public static void method1(int a) throws NotNumberexception {
	
		if (a > 9) {
			throw new NotNumberexception(a);
		} else if(a < 9){
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) throws NotNumberexception {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력해주세요 >> ");
		int typeNum = sc.nextInt();
		
		method1(typeNum);
	}
	
}

class NotNumberexception extends Exception {
	public NotNumberexception () {
		super("숫자가 9 이상입니다...");
	}
	
	public NotNumberexception(int num) {
		super(String.format("%d는(은) 올바른 숫자가 아닙니다...", num));
	}
	
}
