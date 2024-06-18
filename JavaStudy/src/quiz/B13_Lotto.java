package quiz;

import java.util.Scanner;


public class B13_Lotto {

	/*
	 *(1) 1 ~ 45 사이의 중복 없는 랜덤 숫자 7개를 생성하여 로또 당첨 번호를 만들어보세요
	 * 
	 * 1. 숫자를 랜덤으로 뽑는다
	 * 2. 뽑았으면 이전에 뽑았던 숫자중에 방금 뽑은 숫자가 없는지 확인한다.
	 * 3. 있으면 다시 뽑고 없으면 넘어간다.
	 * 
	 * (2) 1등 또는 2등에 당첨될때까지 랜덤 또는 번호를 계속 생성하여
	 * 몇 번 만에 당첨되었는지 출력해보세요
	 * 
	 * - 로또 구매자는 번호를 6개 고른다
	 * - 보너스 번호를 제외하고 모두 맟추면 1등
	 * - 보너스 번호흘 포함하여 모두 맟추면 2등
	 * 
	 */
	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
		int currIndex = 0;

		int[] winNums = new int[7];

		while (currIndex < 7) {
			int num = (int) (Math.random() * 45 + 1);

			boolean repeated = false;
			for (int i = 0; i < currIndex; ++i) {
				if (winNums[i] == num) {
					// 이전에 뽑은 숫자 중에 중복되는 숫자가 있음
					repeated = true;
					break;

				}
			}

			if (!repeated) {
				winNums[currIndex] = num;
				++currIndex;
			}
			
		}	
		
		int [] user = new int[6];
		
		System.out.println("숫자 6개를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		for(int i = 0; i < user.length; ++i) {
			user[i] = num;
		}
		
		int sameCount = 0;
		for(int i = 0; i < winNums.length; ++i) {
			for(int j = 0; j < user.length; ++i) {
				if(winNums[i] != user[j]) {
						sameCount++;
						break;
				}
			}
				
		}
		switch(sameCount) {
		case 6:
			System.out.print("당첨입니다!");
			break;
		default	:
			System.out.println("꽝");
			break;
		
		}


	}
	
}


// 

