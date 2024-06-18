package quiz;

public class B11_WhileQuiz_a {

	public static void main(String[] args) {
		
		// 1.

		int i = 1000;
		while (i <= 2000) {
			if (i % 13 == 0) {
				System.out.println(i);
			}
			++i;
//			System.out.println(i); // 아래 ++i; 대신 괄호에 넣을 수 있음
//			++i;
		}
		i = 50;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			++i;
		}
		System.out.println("총합: " + sum);
		
		i = 1;
		int cnt = 0;
		while(i <= 1000) {
			if (i % 10 == 0) {
				System.out.println(i + "\t");
				if (++cnt % 8 == 0) {
					System.out.println();
				}
				
			}
			++i;
		}
		System.out.println();
		
		i = 1;
		long sum2 = 1;
		
		while(i <= 19) {
			sum2 *= i;
			++i;
		}
		System.out.println(sum2);
		
		
		i = 8999;
		cnt = 0;
		while ( i >= 4999) {
			if (i % 287 == 0) {
				if (++cnt == 5) {
					System.out.println("5번째 287의 배수: " + i);
				}
			}
			--i;
		}
		
		
	}
}
