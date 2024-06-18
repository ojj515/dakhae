package quiz;

public class B13_RandomScores {
	
	/*
	 *  1. 100개의 정수 랜덤으로 생성하여 배열에 저장
	 *  (점수는 0 ~ 100)
	 *  
	 *  2. 배열에 저장된 값을 한 줄에 10개씩 출력
	 *  (단, 60점 미만의 점수는 X로 표시)
	 *  
	 *  3. 모든 점수의 평균 점수를 출력 (소수 둘째 자리까지 출력)
	 *  
	 *  4. 생성된 랜덤 점수 중 가장 높은 점수와 가장 낲은 점수를 출력
	 * 
	 *  # 모든 과정을 하나의 반복으로 처리하는 것은 금지
	 *  
	 */ 
	
	public static void main(String[] args) {
		
		int[] numbers;
		
		numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println((int)(Math.random() * 100) + 1 + "점");
		}
		System.out.println();
		
		int count = 0;
		numbers = new int[100];

		for (int i = 0, printcount = 0; i < numbers.length; i++) {
			int ram = (int) (Math.random() * 100) + 1;
			if (ram < 60) {
				System.out.print("X\t");
				++count;	
			} else if(ram >= 61) {
				System.out.print(ram + "점\t");
				++count;
			}

				printcount++;
			
				if(printcount % 10 == 0) {
				System.out.println();
				}
		}
		System.out.println();
		
		int [] numbers2 = {36, 37, 51, 80, 67};
		int sum = 0;
		for (int i = 0; i < numbers2.length; i++) {
			sum += numbers2[i];
		}	
		double ave = sum / (numbers2.length);
		double temp = Math.round(ave * 100) / 100.0;
			System.out.println("총점은 " + sum + "점이며 " + "평균은 " + temp + "점입니다");
		
		System.out.println();	
		
		numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			
		}
		
			
	}

}
