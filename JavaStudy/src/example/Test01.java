package example;

public class Test01 {

	public static void main(String[] args) {
		
		
		Cafe c1 = new Cafe();
		Cafe c2 = new Cafe();
		
		c1.changeName("빽다방");
		c2.changeName("얼음값500원카페");
		
		c1.addMenu("아메리카노", 0, 1500);
		c2.addMenu("카푸치노", 10, 1800);
		
		c1.printCafeInfo();
		c2.printCafeInfo();

	}

}

class Cafe {

	String name = "기본카페이름";
	int area = 10;
	int seat = 20;
	int table = 5;
	CafeMenu[] menu = new CafeMenu[5];
	int menuCount = 0;
	
	void changeName (String name) {
		this.name = name;
	}
	void printCafeInfo() {
		System.out.printf("카페이름: %s\n", this.name);
		System.out.printf("면적: %d평\n", this.area);
		System.out.printf("좌석수: %d석\n", this.seat);
		System.out.printf("테이블수: %d테이블\n", this.table);
		
		for(int i = 0; i<menu.length; ++i) {
			if (menu[i] != null) {
			System.out.printf("- %s : %d원(%dkcal)\n", 
					menu[i].name ,menu[i].price, menu[i].calories);
			} else {
				System.out.println(menu[i]);
			}
		}
	}
	void addMenu(String name, int calories, int price) {
		CafeMenu toAdd = new CafeMenu();
		
		toAdd.name = name;
		toAdd.calories = calories;
		toAdd.price = price;
		
		this.menu[this.menuCount++] = toAdd;
	}
}	 

class CafeMenu {
	String name;
	int calories;
	int price;
}