package quiz;

import java.util.Scanner;

public class B05_MonthToSeason {

	/* 
	 *  사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요
	 *  (switch-case문, if문으로 한 번씩 만들기)
	 *  
	 */
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 월인지 입력해주세요 >> ");
		
		// switch-case
		
		int mon =  sc.nextInt();
		switch (mon) {
			case 3:
			case 4:
			case 5:
				System.out.printf("%d월은 봄입니다", mon);
				break;
			case 6:
			case 7:
			case 8:
				System.out.printf("%d월은 여름입니다", mon);
				break;
			case 9:
			case 10:
			case 11:	
				System.out.printf("%d월은 가을입니다", mon);
				break;
			case 1:
			case 2:
			case 12:
				System.out.printf("%d월은 겨울입니다", mon);
				break; 
				
			
		}
		
		boolean cheat = false;
			if (mon < 0 || mon > 12) 
			System.out.println("월이 이상합니다!");
			cheat =  cheat || true;
		
		if (mon >= 3 && mon <= 5) {
			System.out.printf("%d월은 봄입니다", mon);
		} else if (mon <= 6 && mon >= 8) {
			System.out.printf("%d월은 여름입니다", mon);
		} else if (mon <= 11 && mon >= 9) {
			System.out.printf("%d월은 가을입니다", mon);
		} else {
			System.out.printf("%d월은 겨울입니다", mon);
		}
		
				
	}
	
}
