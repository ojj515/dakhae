package quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D02_LottoSet2 {

	/*
	 *  HashSet을 사용해 1~45 사이의 중복없는 숫자 7개의 랜덤 숫자를 생성해보세요
	 */
	public static void main(String[] args) {
		
		
		HashSet<Integer> scores = new HashSet<>();
		
		while(scores.size() != 7) {
			int ran = (int)(Math.random() * 45) + 1;
			scores.add(ran);
		}
		System.out.println(scores);
		

	}
	
	
}

