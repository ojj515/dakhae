package myobj.academy;

public class NameGenerator {

	// 다른 클래스에서 쓸 필요가 없는 기능들은 private로 숨겨놓는다
	private static String[] lastNameCandidates = { "김", "이", "박", "최" };
	private static String[] firstNameCandidates = { "영", "철", "수", "지", "민", "식", "시" };

	public void setLastNameCandidates(String... lastNames) {
		this.lastNameCandidates = lastNames;
	}

	public void setFirstNameCandidates(String...firstNameCandidates) {
		this.firstNameCandidates = firstNameCandidates;
	}	

	// 다른 클래스에서 쓸 필요가 없는 기능들은 private로 숨겨놓는다
	private String selectRandamOne(String[] arr) {
		return arr[(int)(Math.random() * arr.length)];
	}

	public String generate() {
		return selectRandamOne(lastNameCandidates)
				+ selectRandamOne(firstNameCandidates)
				+ selectRandamOne(firstNameCandidates);
	}
	public static String getRandomName() {
		return lastNameCandidates[(int)(Math.random() * lastNameCandidates.length)]
				+ firstNameCandidates[(int)(Math.random() * firstNameCandidates.length)]
				+ firstNameCandidates[(int)(Math.random() * firstNameCandidates.length)];		
	}
}
