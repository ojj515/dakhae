package myobj.blackjack2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BlackJackGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BlackJack game1 = new BlackJack();
		
		System.out.println("블랙잭 게임에 오신걸 환영합니다");
		System.out.println("-------------------------");
		System.out.println("1: 게임 시작 " + "2: 게임 종료");
		System.out.println("숫자 입력 >> " );
		System.out.println(game1.gameStart(sc.nextInt()));
		game1.DeckShuffle();
		System.out.println("Hit or Stand?");
	}
	
}

class BlackJack {
	
	List<Integer> deck = new LinkedList <>();

	int [] cardNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	
	int userSum = 0;
	int dealerSum = 0;
	int bettingMoney = 0;
	
	int dealerMinNum = 17;
	int blackJackNum = 21;
	
	public String gameStart(int num) {
		
		if(num == 1) {
			return "게임을 시작합니다";
		} else if (num == 2) {
			return "게임을 종료합니다";
		} else {
			return "1과 2사이의 숫자를 입력해주세요";
		}
		
	}
	
	public void DeckShuffle() {
		
		int score = 0;
		
		for(int i = 0; i < 2; ++i) {
			int ranNum = (int)(Math.random() * cardNum.length) + 1;
			int selectNum = cardNum [ranNum];
			
			score += cardNum [ranNum];
			
			if(cardNum [ranNum] == 'A') {
				System.out.print("(11)");
			}
			if(cardNum [ranNum] == 'J') {
				System.out.print("(10)");
			}
			if(cardNum [ranNum] == 'K') {
			System.out.print("(10)");
			}
			if(cardNum [ranNum] == 'Q') {
			System.out.print("(10)");
			}
			System.out.print(selectNum+ " ");
		}
		System.out.println("당신의 점수입니다" + score);
		
	}
	
	
	
	public void CardPlus() {
	
	List<String> Deck = new LinkedList <>();	
		
	Collections.addAll(Deck, "1","2","3","4","5","6","7","8","9","11",
			"A","J","K","Q");
	
	
	}	
	
	
	
}

