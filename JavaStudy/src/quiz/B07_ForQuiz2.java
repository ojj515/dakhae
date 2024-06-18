package quiz;

public class B07_ForQuiz2 {
	/*
	 * for문을 사용해 숫자를 다음과 같이 출력해보세요
	 * 
	 * 1. 0 3 6 9 12 ... 93 96 99
	 * 2. -35, -28, -21... 0 7 14...35
	 * 3. 100 200 300...800 9000 1000
	 * 4. 100 99 98...5 4 3 2 1 0
	 * 5. 0 1 2 3 ...9 (30번 반복)
	 * 6. 10 9 8...3 2 1(30번 반복)
	 * 7. 7 77 7777 7777....7777777777
	 */
	
	public static void main(String[] args) {
		
		// 1.
		
		
		// for문 내부에서 선언한 변수는 for문의 {}가 끝나면 사라진다
		for (int i = 0; i <= 99; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		for (int num = 0; num <= 99; ++num) {
//			if (num % 3 == 0) {
//				System.out.printf("%d\n", num);
//			}
			
//		}
		
		// 2.
		
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}	
		System.out.println();
		
//		for (int num = -35; num <= 35; ++num) {
//			if (num % 7 == 0) {
//				System.out.printf("%d\n", num);
//			}
//		}
		
		// 3.
		
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		System.out.println();
		
//		for (int num = 100; num <= 1000; ++num) {
//			if (num % 100 == 0) {
//				System.out.printf("%d\n", num);
//			}
//		} 
		
		// 4.
		
		for (int i = 100; i >= 0; --i) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		System.out.println();
		
//		for(int num = 100; num >= 0; --num) {
//			System.out.println(num);
//		}
		
		// 5.
		
		System.out.println();
		
		for (int i = 0; i < 30; ++i) {
			System.out.print(i % 10 + " ");
		}
		System.out.println();	
		
		// 6.
		
		for (int i = 0; i < 30; ++i) {
			System.out.print((10 - i % 10) + " ");
		}
		System.out.println();
		
		// 7.
		
		long num = 7;
		for (int i = 0; i < 10; ++i) {
			System.out.print(num + " ");
			num = num * 10 + 7;
		}
		
		String numStr = "";
		for (int i = 0; i < 10; ++i) {
			numStr += "7";
			System.out.print(numStr + " ");
		}	
		
		
	}
	
		
}


