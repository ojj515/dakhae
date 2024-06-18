package quiz;

public class D08_Omok {

	// 오목을 만들어 주세요
	
	public static void main(String[] args) {
		// hint 콘솔에 판 그리는 방법
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				System.out.printf("%2c" , '┼'); 
			}
			System.out.println();
		}
		
		// hint2 : 오목판에 돌 놓는 방법 
		char[][] omok = {
			{'┌', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┐'},
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
			{'├', '┼', '┼', '●', '○', '┼', '┼', '┼', '┼', '┤'},	
			{'├', '┼', '┼', '┼', '●', '┼', '┼', '┼', '┼', '┤'},
			{'├', '┼', '┼', '┼', '┼', '●', '┼', '┼', '┼', '┤'},	
			{'├', '┼', '┼', '┼', '┼', '┼', '○', '┼', '┼', '┤'},	
			{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},	
		};
		
		System.out.println(omok[0][0]);
		
		for (int i = 0; i < omok.length; ++i) {
			for(int j = 0; j < omok[i].length; ++j) {
				System.out.printf("%-2c", omok[i][j]);
			}
			System.out.println();
		}

	}

}
