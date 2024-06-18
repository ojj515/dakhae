package quiz;

public class B10_Gugudan {

	// 1. 구구단 가로로
	// 2. 구구단 세로로
	
	public static void main(String[] args) {
		
		for (int a = 2; a <= 9; ++a) {
				System.out.print(a + "단: ");
			for(int b = 1; b <= 9; ++b) {
				System.out.printf("%dx%d=%-2d ", a, b, a * b);
			}	
			System.out.println();
		}
		
		for (int a = 0; a <= 9; ++a) {
			for (int b = 2; b <= 9; ++b) {
				if (a == 0) {
					System.out.println(b + "단\t\t");
				} else {
					System.out.printf("%dx%d=%-2d\t", a, b, a * b);
				}

			}
		}

	}

}
