package myobj.academy;

public class ProgrammingStudent2 extends AcademyStudent{
	
// 프로그래밍 반 학생들은
// 과학,물리,지리,철학,생리학	
	
	static String[] subjectNames = {"과학","물리","지리","철학","생리학"};
	int [] scores = new int[5];
	
	public ProgrammingStudent2() {
		for(int i = 0; i<scores.length; ++i) {
			scores[i] = generateRandomScore();
		}
	}
	
	@Override
	public int getTotal() {
		return super.getTotal();
	}
	
}
