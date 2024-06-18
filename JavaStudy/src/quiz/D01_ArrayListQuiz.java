package quiz;

import java.util.ArrayList;

public class D01_ArrayListQuiz {

	// 1. 리스트에 1000 ~ 1999 사이의 랜던 정수를 100개 추가하기
	
	// 2. 원본에서 짝수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	
	// 3. 2번의 결과에서 홀수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		
		for (int i = 0; i < 100; ++i) {
			int ranNum = (int) (Math.random() * 999) + 1000;
			num.add(ranNum);
		}
		System.out.println(num);

		int count = 0;

		for (int i = 0; i < num.size(); ++i) {
			if (num.get(i) % 2 == 0) {
				int deleted = num.remove(i);
				++count;

				System.out.println("삭제한 숫자: " + deleted);
			}
		}
		System.out.println("남은 숫자 갯수: " + count);
		
	}

}
