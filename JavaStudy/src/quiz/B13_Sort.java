package quiz;

import java.util.Arrays;

public class B13_Sort {

	/*
	 *  1~1000 사이의 랜덤 정수 값이 30개 들어있는 배열을 하나 생성한 후
	 *  해당 배열의 내용을 하나 생성한 후 해당 배열의 내용을 작은 값부터 차례대로 저장한 후
	 *  새로운 배열을 만들어 원본과 함께 출력해주세요
	 */
	
	public static void main(String[] args) {
		
		int[] num = new int[30];

		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 1001);

			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 1001);	
		
			System.out.print(num[i] + " ");
		}
		
	}

}


//System.out.println();
//Arrays.sort(num);
//for(int k : num) {
//	System.out.print(k + " ");
