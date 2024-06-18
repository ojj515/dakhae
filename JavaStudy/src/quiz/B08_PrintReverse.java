package quiz;

import java.util.Scanner;

public class B08_PrintReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요 >> ");
		String word = sc.next();
		
		int reverse = word.length();
		
		for(int i = reverse - 1; i >= 0; --i) {
			System.out.printf("%s", word, word.charAt(i));
		}
		
	}
} 
