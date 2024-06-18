package quiz;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
	    
	    System.out.println("숫자를 입력해주세요 >> ");
	    int typeNum = sc.nextInt();
	    
	    for(int i = 1; i < 10; ++i) {
	    	System.out.println(typeNum + "*" + i + "=" + (typeNum * i));
	    }
	}
	
	
}
