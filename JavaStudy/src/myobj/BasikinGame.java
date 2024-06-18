package myobj;

public class BasikinGame {
	int playerNum;
	int lastNum;
	
	// 초기화히지 않은 인스턴스 변수는 배열처럼 기본형을 갖고있다
	int currentNum;
	
	public BasikinGame(int playerNum, int lastNum) {
		this.playerNum = playerNum;
		this.lastNum = lastNum;
	}
	
	/**
	 * 
	 * @param num - 사용자가 게임을 위해 선택한 숫자를 전달해주세요
	 * @return -1: 사용자가 1 ~ 3을 벗어나는 값을 입력한 경우
	 * -2: 사용자가 마지막값을 벗어나는 숫자를 더하려고 하는 경우
	 */
	
	
	public int next(int num) {
		
		if(num < 1 || num > 3) {
			return -1;
		} else if (currentNum + num > lastNum) {
			return -2;
		}
		return currentNum;
	}
	
	public boolean isEnd() {
		return currentNum == lastNum;
	}
}
