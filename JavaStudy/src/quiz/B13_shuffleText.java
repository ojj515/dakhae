package quiz;

import java.util.Scanner;

public class B13_shuffleText {
	
	
	/*
	 * 사용자로부터 문장을 입력받으면
	 * 해당 문자의 순서를 랜덤으로 뒤섞은 결과를 만들어낸 출력해보세요
	 * (문장 내에 공백이 포함되어 있으면 제거할 것)
	 *  
	 *  ex> 오늘 나는 지하철을 타고 왔다 ->다고지타왔오나는늘...
	 *  
	 *  1. 문장을 입력받으면 공백을 제거한 배열로 만들고 싶다
	 *  
	 *  (1) 배열을 만들기 위해서는 정확한 배열의 크기를 알아야 한다
	 *  (2) 입력받는 문장에서 공백이 아닌 문자의 개수를 알아야
	 *  배열의 크기를 설정할 수 있다
	 *  (3) 문자열에 들어있는 공백이 아닌 문자들을 배열로 옮겨담는다
	 *  
	 */

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력해 주세요>> ");
		
		String type = sc.nextLine();
		int len = type.length();
		char [] shuffled = new char[len];
			
		for(int i = 0; i< len; ++i) {
			int ram = (int)(Math.random() * len);
			
			shuffled[i] = type.charAt(i);
			
			char [] ramchat = new char[len];
			
		}
		
	}
	
	
}