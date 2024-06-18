package quiz;

import java.util.Scanner;

public class B13_shuffleText_a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// "Hello" -> {'H','e','l','l','o'}
		String text = sc.nextLine();
		
		String spaceRemoved = "";
		
		for(int i = 0, len = text.length(); i <len; ++i) {
			char ch = text.charAt(i);
			if (ch != ' ') {
				spaceRemoved += ch;
			}
		}
				
		
		// text.length()개의 크기의 배열을 생성
		char[] arr = new char[spaceRemoved.length()];
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = spaceRemoved.charAt(i);
		}
		
		
		// 섞기 (랜덤한 위치를 뽑으려 하면 같은 위치가 자꾸 걸려서 문제가 된다)
//		for (int i = 0; i < arr.length; ++i) {
//			arr[i] = arr[(int)(Math.random() * arr.length)];
//			
//		}
//		System.out.println(arr);
		
		//화투처럼 섞기 (0번 위치와 랜덤 위치의 값을 1000번 교환한다)
		
		/*
		 * length : 5
		 *  	 0   1   2   3   4
		 * arr {'H','e','l','l','o'} 	
		 * 
		 * temp ''
		 * 
		 */
		
		for(int i = 0; i < 1000; ++i) {
			int randomIndex = (int)(Math.random() * (arr.length - 1) + 1);
			
			char temp= arr[0];
			arr[0] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		System.out.println(arr);
	}
	
}
