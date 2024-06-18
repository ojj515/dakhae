package myobj;

public class SmallCar {

	public static void main(String[] args) {
		
		 SmallCar car1 = new SmallCar(1,"노란색");
		 SmallCar car2 = new SmallCar(3,"파란색");
		
		 car1.carInfo();
		 System.out.println();
		 car2.carInfo();
		 
	}
	
	int sitNum;
	
	String color;

	static int carWheelNum = 4;
	static int flashLight = 2;

	public SmallCar(int sitNum,String color) {
		
		this.sitNum = sitNum;
		this.color = color;
	}
	void carInfo() {
		System.out.printf("차 색깔: %s\n", color);
		System.out.printf("차 탑승 인원: %d명\n", sitNum);
		System.out.printf("차 바퀴 갯수: %d개\n", carWheelNum);
		System.out.printf("차 조명 갯수: %d개\n", flashLight);
	}
	
	

}
