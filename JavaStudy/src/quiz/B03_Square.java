package quiz;

import java.util.Scanner;

public class B03_Square {

	/* 
	 * 	※ 직사각형 넓이를 계산하고 출력하시오
	 * 
	 * [조건]
	 * 
	 * - 문자열 변수로 직사각형 이름 입력받기
	 * - 실수형 변수로 가로, 세로 길이 입력받기
	 * - 이름과 넓이 출력하기
	 * (이름에 쌍 따옴표 넣고 넓이는 소수점 2자리까지 출력 printf 활용
	 * - 넓이가 100초과 500미만이라명 true 출력
	 * 
	 * [예시]
	 * 이름 이름: 상민
	 * 가로 입력: 10.5
	 * 세로 입력: 10.5
	 * "상민" 직사각형의 넓이는 110.25
	 * true
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = sc.next();
		
		System.out.print("가로 입력: ");
		double width = sc.nextDouble();
		
		System.out.print("세로 입력: ");
		double height = sc.nextDouble();
		
		double area = Math.round(width * height * 100) / 100.0;
		
		System.out.printf("\"&s\" 직사각형의 넓이는 %.2f\n", name, area);
	
	}
	
	
}

