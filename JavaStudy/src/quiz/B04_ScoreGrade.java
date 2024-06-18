package quiz;

import java.util.Scanner;

public class B04_ScoreGrade {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		/* 
		 * 국어 , 영어 , 수학, 점수를 차례대로 입력받아 점수를 구한 후에
		 * 평균 점수와 등급을 출력해주는 프로그램을 만들어보세요
		 * (각 과목의 유효 점수는 0 ~ 100점이고)
		 *  유효하지 않은 점수가 하나라도 있다면 평균 점수는 0점, 등급은 f로 나와야 한다)
		 *  
		 *  1. 평균 점수가 90점 이상 A
		 *     평균 점수가 80점 이상 B
		 *     평균 점수가 70점 이상 C
		 *     평균 점수가 60점 이상 D
		 *     그 외 F
		 */
		
		System.out.print("국어 점수를 입력해주세요 >> ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요 >> ");
		int english = sc.nextInt();
		System.out.print("수학 점수를 입력해주세요 >> ");
		int math = sc.nextInt();
		
		int average = (korean + english + math) / 3;
		
		System.out.println(average);
		
		if (average >= 90) {
			System.out.printf("점수는:%d점 , 등급은 A입니다\n" , average);
		} else if (average >= 80) {
			System.out.printf("점수는:%d점 , 등급은 B입니다\n" , average);
		} else if (average >= 70) {
			System.out.printf("점수는:%d점 , 등급은 C입니다\\n" , average);
		} else if (average >= 60) {	
			System.out.printf("점수는:%d점 , 등급은 D입니다\\n" , average);
		} else
			System.out.printf("점수는:%d점 , 등급은 F입니다\n" , average);
		
		if (korean < 0 || korean < 100)	
			System.out.printf("점수는:0점 , 등급은 F입니다\n");
		 else if (english < 0 || english < 100) {
			System.out.printf("점수는:0점 , 등급은 F입니다\n");	
		} else if (math < 0 || math < 100) {
			System.out.printf("점수는:0점 , 등급은 F입니다\n");
		}	
	
					
	}
	
}
