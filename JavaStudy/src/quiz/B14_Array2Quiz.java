package quiz;

public class B14_Array2Quiz {

	public static void main(String[] args) {


		int[][] myArr = {
				
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0,0,0},
			new int[10],
			{0,0,0,0}
		};
		
		// 1. myArr의 모든 값을 100 ~ 200 사이의 정수로 바꾸기
		
		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균을 구하기
		
		// 3. 각 행(row)의 합을 구해서 출력하기
		
		// 4. 각 열(col)의 합을 구해서 출력하기
		

		
		for(int i = 0; i < myArr.length; ++i) {
			for(int j = 0; j < myArr[i].length; ++j) {
				
				myArr[i][j] = (int)(Math.random() * 101) + 100;
				
				System.out.printf("행:[%d] 열:[%d] = %d ",i, j, myArr[i][j]);
				
			}
			System.out.println();
		}
		System.out.println();
		
		int count = 0;
		
		double average = 0;
		
		for(int i = 0; i < myArr.length; ++i) {
			for(int j = 0; j < myArr[i].length; ++j) {
				
				myArr[i][j] = (int)(Math.random() * 101) + 100;
				
				count += myArr[i][j];
			}
		}
		average = count / myArr.length;
		
		System.out.print("총합: " + count + " " + "평균: " + average);
		
		System.out.println();
		
		System.out.println();
				
		
		int [] width = new int[myArr.length];
		
		for(int i = 0; i < myArr.length; ++i) {
			for(int j = 0; j < myArr[i].length; ++j) {
				
				myArr[i][j] = (int)(Math.random() * 101) + 100;
				
				width[i] += myArr[i][j];
				
			}
			System.out.printf("%d의 행의 총합: %d ", i , width[i]);
			
			System.out.println();
		}
		System.out.println();
		
		
		
		
	}
	
	// { (0,1) (0,2) (0,3) (0,4) (0,5) }
	// { (1,1) (1,2) (1,3) (1,4) (1,5) }
	// { (3,1) (3,2) (3,3) }
	
	
}
