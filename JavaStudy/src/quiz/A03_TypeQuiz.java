package quiz;

public class A03_TypeQuiz {

	public static void main(String[] args) {
		
		int age = 20;  //자원을 아주 절약해야하는 상황이 아니라면 그냥 int쓰는 편
		
		String name = "홍길동"; 
		String tel = "010-1234-1234";
		
		// AB형은 char타입에 저장할 수 없으므로 String을 써야 한다.
		String blood = "O";
		
		// 자원을 아주 절약해야 하는 상황이 아니라면 double 쓰는 편
		double height = 178.5;
		double weight = 75;
		
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("Tel :" + tel);
		System.out.println("키 :" + height);
		System.out.println("몸무게 :" + weight);
		System.out.println("혈액형 : " + blood);
		
	}
	
		
}