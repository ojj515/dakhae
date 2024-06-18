package myobj.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	final public static int USER_PLAYER = 0;
	final public static int DEARER_NOT_OPEN = 1;
	final public static int DEARER_OPEN = 2;
	
	
	int printtype; // 0이면 일반 플레이어, 1이며 카드 가려놓는 딜러, 2면 카드 오픈하는 딜러
	int money;
	List<Card> hand = new ArrayList();


	public Player(int type, int money) {
		this.printtype = type;
		this.money = money;
	}
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public List<Card> getHand() {
		return hand;
	}	
	public void setPrintType(int printType) {
		this.printtype = printType;
	}
		
	
	public void printHand() {
		if(printtype == 0) {
			System.out.printf("플레이어: %s (%d)\n", hand, GameLogic.getValue(hand));
		} else if (printtype == 1) {
			System.out.printf("딜러: X %s\n", hand.get(1));
		} else if (printtype == 2) {
			System.out.printf("딜러: %s (%d)\n", hand, GameLogic.getValue(hand));
		}
	}
	
	public void resetHand() {
		while(hand.size() > 0) {
			hand.remove(0);
		}
	}
	
	public void printMoney() {
		System.out.println(this.money);
	}
	public void earnMoney(int money) {
		this.money += money;
	}
	
	public void lossMoney(int money) {
		this.money -= money;
	}

	public int getMoney() {
		return this.money;
	}
}
