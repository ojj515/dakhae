package myobj.omok_m;

import java.util.Scanner;

public class Omok {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] omok = {
				{'┌', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┐'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'└', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┘'},
			};

			System.out.println("-------------------");
			System.out.println("백의 차례");
			System.out.println("-------------------");
			System.out.println("열의 위치를 입력해주세요");
			int chooseNum1 = sc.nextInt(); 
			System.out.println("행의 위치를 입력해주세요");
			int chooseNum2 = sc.nextInt();
			
			for(int i = 0; i < omok.length; ++i) {
				for(int j = 0; j < omok[i].length; ++j) {
					if(chooseNum1 <= 15 || chooseNum2 <= 15) {
						omok [chooseNum1][chooseNum2] = '●';
					}
					System.out.printf("%-2c", omok[i][j]);
				}
				System.out.println();
			}
			System.out.println("-------------------");
			System.out.println("흑의 차례");
			System.out.println("-------------------");
			System.out.println("열의 위치를 입력해주세요");
			int chooseNum3 = sc.nextInt(); 
			System.out.println("행의 위치를 입력해주세요");
			int chooseNum4 = sc.nextInt();
			
			for(int i = 0; i < omok.length; ++i) {
				for(int j = 0; j < omok[i].length; ++j) {
					if(chooseNum3 <= 15 || chooseNum4 <= 15) {
						omok [chooseNum3][chooseNum4] = '○';
					}
					System.out.printf("%-2c", omok[i][j]);
				}
				System.out.println();
			}
	}
}

	
	



