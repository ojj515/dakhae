package quiz;

public class C04_CountFishBread_a {

	
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
		
		FishBread a1 = new FishBread();
		
		a1.quality = "상";
		
		a1.qualityPrice();
		
		a1.FishBreadPrice();
		
	}
	
}

class FishBread {
	
	int redBeanPrice = 800;
	int custardPrice = 1000;
	int mintChocoPrice = 1200;
	String quality;
	
	public void qualityPrice() {
		if(quality.equals("상")) {
			redBeanPrice = redBeanPrice + 100;
			custardPrice = custardPrice + 100;
			mintChocoPrice = mintChocoPrice + 100;
		}
		if(quality.equals("하")) {
			redBeanPrice =  redBeanPrice - 100;
			custardPrice =  custardPrice - 100;
			mintChocoPrice = mintChocoPrice - 100;
		}
		
	}
	void FishBreadPrice () {
		System.out.printf("품질이 %s일때 붕어빵 가격은 %d원\n", quality, redBeanPrice);
		System.out.printf("품질이 %s일때 슈크림 가격은 %d원\n", quality, custardPrice);
		System.out.printf("품질이 %s일때 민트초코 가격은 %d원\n", quality, mintChocoPrice);
	}


	
	
	
	
}