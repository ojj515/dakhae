package quiz;

import java.util.Scanner;

public class B12_UpdownGame {

	/* Updown 게임을 만들어보세요
	 * 
	 * 1. 게임이 시작되면 1 ~ 100 사이의 랜덤 숫자가 정답이 된다
	 * 
	 * 2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다
	 * 
	 * 3. 만약 사용자가 현재 추측 범위를 벗어나는 숫자를 입력했다면
	 * 기회를 소진하지 않고 다시 입력할 수 있는 기회를 준다
	 * 
	 * ex) 50
	 * 	   Down! (남은 기회 4회)
	 * 	   75
	 *     추측 범위를 벗어난 숫자입니다...(남은 기회 4회)
	 *     
	 * 4. 6번 안에 못맞추면 정답이 뭐였는지 알려주고 프로그램을 종료한다    
	 * 
	 * 5. 사용자가 정답을 맞추면 축하한다고 해주고 프로그램을 종료한다.
	 * 
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("랜덤한 숫자를 입력해주세요 >> ");
		int num = (int)((Math.random() * 100) + 1);
		int count = 5;
		System.out.println(num);
		
		int numEnter = 0;
		while (num != numEnter) {
			System.out.print("1 ~ 100 사이의 숫자를 입력해주세요: ");
			numEnter = sc.nextInt();
			
			if(num == numEnter) {
				System.out.print("정답입니다!");
				break;
			}
			if(count == 0) {
				System.out.print("기회를 모두 소진하셨습니다\n" + "정답은" + num + "입니다");
				break;
			}
			if(numEnter > 100) {
				System.out.println("추측 범위를 벗어난 숫자입니다..."+ "(남은기회:" + count + ")");
				count--;
			} else if (num < numEnter) {
				System.out.println("down!" + "(남은기회:" + count + ")");
				count--;
			} else if(num > numEnter) {
				System.out.println("UP!" + "(남은기회:" + count + ")");
				count--;
			}
			
			
			
		}
		
	}

}


