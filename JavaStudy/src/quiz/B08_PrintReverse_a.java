package quiz;

import java.util.Scanner;

public class B08_PrintReverse_a {

	// "apple"
	//  01234
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자를 입력>> ");
		
		String text = sc.nextLine();
		
		for(int i = 0; i < 5; ++i) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i = text.length() - 1; i >= 0; --i) {
			System.out.println(text.charAt(i));
		}	
		System.out.println();
		
		int len = text.length();
		for (int i = 0; i < len; ++i) {
			System.out.println(text.charAt(len - 1 - i));
		}
		System.out.println();
	}
	
}

