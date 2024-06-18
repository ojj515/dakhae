package quiz;

import java.util.Arrays;

import myobj.Fbread;

public class C04_CountFishBread {

	
	/*
	 * 1. 붕어빵 클래스를 만들어보세요
	 * 
	 * 	붕어빵의 속성은 맛,가격,품질이 있으며 맛과 품질이 있다
	 *  맛과 품질은 인스턴스 생성시 랜덤으로 결정됨
	 * 	가격은 팥 800원, 슈크림 1000원, 민트초코 1200원이고
	 *  품질에 따라 +-100원이 된다 (품질은 상/중/하)
	 *  
	 *  2. 설계한 클래스를 활용하여 붕어빵을 100개 만들고
	 *  어떤 맛 붕어빵이 몇 개 있는지 세어보세요
	 *  
	 */
	
	public static void main(String[] args) {
		Fbread[] breads = new Fbread[100];
		
		for (int i = 0; i < breads.length; ++i) {
			breads[i] = new Fbread();
		}
		int [] flavorCount = new int[Fbread.KindOfFlavors];
		
		for (int i = 0; i < breads.length; ++i) {
			flavorCount[breads[i].flavor] += i;
		}
		System.out.println(Arrays.toString(flavorCount));
		System.out.println("총가격: " + Fbread.getTotalPrice(breads));
	}
}