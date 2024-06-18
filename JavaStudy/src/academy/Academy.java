package academy;

import java.util.Arrays;

public class Academy {

	int [] score = new int [100];
	
	int [] studentId = new int[100];
	
	int sum = 0;
	
	char grade;
	
	String [] name = { "윤광훈", "서현옥", "황윤정", "임종하", "문재호", "탁한빈", 
				"오지선", "전승언", "홍대영", "심인태", "문태원", "남궁경태","사공대준", "제갈예원", 
				"복성숙", "배우정", "정승용", "정원옥", "류보경", "김대희", "남궁윤진", "신춘수", 
				"이연희", "권우진", "허다운", "하우람", "유달", "오우람", "전버들", "장빛가람", "허으뜸", "박한결", 
				"정믿음", "하나길", "표나길", "성나라우람", "박미르", "최다운", "심한결", "추샘",  
				"최나라우람", "정빛가람", "사공나길", "예한길", "배달", "강힘찬", "복우람", "류한길", 
				"류한길", "복빛가람","오다운", "유힘찬","전힘찬", "배믿음", "허으뜸", "박한결"
		
	};
	
	public void webProgrammingScore() { // 시작은 소문자로 쓰자
		for(int i = 0; i < score.length; ++i) {
			score[i] = (int)(Math.random() * 100) + 1;
				if(score[i] >= 90) {
					grade = 'A';
				} else if(score[i] >= 80 && score[i] < 90) {
					grade = 'B';
				} else if(score[i] >= 70 && score[i] < 80) {
					grade = 'C';
				} else {
					grade = 'F';
				} 
			System.out.println("국어:" + score[i] + " " + "등급:" + grade);
		}
		for(int i = 0; i < score.length; ++i) {
			sum += score[i];
		}
		System.out.println("이 반의 국어점수 평균은" + sum / score.length);
		
		System.out.println();
		
		for(int i = 0; i < score.length; ++i) {
			score[i] = (int)(Math.random() * 100) + 1;
			System.out.println("영어: " +score[i]);
		}
		for(int i = 0; i < score.length; ++i) {
			sum += score[i];
		}
		System.out.println("이 반의 영어점수 평균은" + sum / score.length);
		
		System.out.println();
		
		for(int i = 0; i < score.length; ++i) {
			
			score[i] = (int)(Math.random() * 100) + 1;
			System.out.println("수학:" +score[i]);
		}
		for(int i = 0; i < score.length; ++i) {
			sum += score[i];
		}
		System.out.println("영어점수 평균은" + sum / score.length);
		
	}
	
	public void randomName() {
		for(int i = 0; i < name.length; ++i) {
			int num = (int)(Math.random() * name.length);
			System.out.println("이름:" + name[num]);
		}
	}
	
	public void studentId() {
		for(int i = 0; i < name.length; ++i) {
			studentId[i] = (int)(Math.random() * 100000) + 202400000;
			System.out.println("학번:" + studentId[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		Academy a1 = new Academy();
		
		a1.webProgrammingScore();
		a1.randomName(); 
		a1.studentId();
		
		System.out.println();

		
	}
	
	
}



