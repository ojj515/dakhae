
public class A03_VariableTypes {

	
	/*
	 * # 정수 타입
	 * - byte 	(1byte, 8bit)
	 * 
	 * 2^8(256)가지의 값을 표현할 수 있다
	 * byte타입 변수에 넣을 수 있는 정수의 범위는 -128 ~ +127(256가지)
	 * 
	 * - short 	(2byte, 16bit)
	 * 
	 * 2^16(65,536) 가지의 값을 표현할 수 있다.
	 * shot타입 변수에 넣을 수 있는 정수의 범위는 -32768 ~ +32677(65536가지)
	 * 
	 * - char 	(unsigned 2byte)
	 * 
	 * 2^16(65,536) 가지의 값을 표현할 수 있으나 부호가 없다(양수만 표현)
	 * char타입 변수에 넣을 수 있는 정수의 범위는 0 ~ 65535(65536가지)
	 * 
	 * - int 	(4byte, 32bit)
	 * 2^32(4,294,967,296) 가지의 값을 표현할 수 있다.
	 * int타입 변수에 넣을 수 있는 정수의 범위는 -2147483648 ~ +2147483647 (4,294,967,296가지)
	 * 
	 * - long 	(8byte, 64bit)
	 * 2^64가지의 값을 표현할 수 있다.
	 * long타입 변수에 넣을수 있는 정수의 범위는 -2^63 ~ + 2^63-1 (2^64가지)
	 * 
	 * 
	 * # 실수 타입
	 * 
	 * - float (4byte)
	 * - double (8byte)
	 * 
	 * # 참/거짓 타입
	 * 
	 * - boolen
	 * 
	 * # 참조형 변수 타입
	 *  - 문자열
	 *  - 그 외 모든 타입(모든 클래스, 객체지향 관련 내용) 
	 */
	
	public static void main(String[] args) {
		byte min_byte = -128 , max_byte = 127;
		short max_short = 32767 , min_short = -32768;
		//, 대신 _를 사용해 큰 숫자를 보기 편하게 적을 수 있다
		int max_int = 2_147_483_647, min_int = -2_147_483_648;
		
		// int의 범위를 벗어나는 수는 뒤에 L을 붙여 long 타입 리터럴임을 명시해야 한다
		long max_long = 9_223_372_036_854_775_807L;
		long min_long =	-9_223_372_036_854_775_808L;
		
		// char 타입에는 0 ~ 65535의 문자 번호를 정수타입으로 보관할 수 있다
		// (ASCII 코드표 검색)
		
		// '': 문자 타입 리터럴도 숫자로 인식되기 때문에 정수 타입 변수에 저장할 수 있다
		
		// ch1 ~ ch5번의 값을 변경하여 하여 lunch라고 출력되게 만들어보세요
 		char ch1 = 'l';
		char ch2 = 'u';
		char ch3 = 'n';
		char ch4 = 'c';
		char ch5 = 'h';
		
		System.out.println(""+ ch1 + ch2 + ch3 + ch4 + ch5);
		
		System.out.println("byte타입에 들어갈 수 있는 가장 큰 값은 " + max_byte + "이고 "
				+ "가장 작은 값은 " + min_byte + "입니다.");
		System.out.println("short타입에 들어갈 수 있는 가장 큰 값은 " + max_short + "이고 "
				+ "가장 작은 값은 " + min_short + "입니다.");
		System.out.println("short타입에 들어갈 수 있는 가장 큰 값은 " + max_int + "이고 "
				+ "가장 작은 값은 " + min_int + "입니다.");
		System.out.println("short타입에 들어갈 수 있는 가장 큰 값은 " + max_long + "이고 "
				+ "가장 작은 값은 " + min_long + "입니다.");
		
		// 정수 리터럴의 기본 타입은 int
		// 실수 리터럴의 기본 타입은 double
		double d1 = 123.123;
		// 8byte 크기의 실수 리터럴을 float타입 변수에 저장할 수 없으므로
        // 뒤에 f를 붙여 float타입 리터럴임을 명시해야 한다
		float f1 = 123.123f;
		
		System.out.println("평균 점수: " + d1 + "점");
		System.out.println("평균 몸무게: " + f1 + "kg");
		
		boolean pass_exam = true;
		boolean goonpil = false;
		boolean late = true;
		
		System.out.println("통과 여부: " + pass_exam);
		System.out.println("군필: " + goonpil);
		System.out.println("지각 여부: " + late);		
			
		String text = "my name is hamburger";
		
		System.out.println(text);
		
	}
	
	
}
