package myobj.BlackJack;

import java.util.List;

public class GameLogic {
	
	final public static int PLAYER_WIN = 0;
	final public static int DEARER_WIN = 1;
	final public static int PUSH = 2;

	static int getValue(List<Card> cards) {
		int sum = 0;
		int aceCount = 0;

		for (Card card : cards) {
			int value = card.getValue();
			sum += value;

			if (value == 11) {
				++aceCount;
			}
		}

		while (aceCount > 0 && sum > 21) {
			sum -= 10;
			--aceCount;
		}

		return sum;

	}

	static int check(List<Card> playerCards, List<Card> dealerCards) {
		int v1 = getValue(playerCards);
		int v2 = getValue(playerCards);
		
		if (v1 > 21) {
			return DEARER_WIN;
		} else if (v2 > 21) {
			return PLAYER_WIN;
		} else if (v1 > v2) {
			return PLAYER_WIN;
		} else if (v1 < v2) {
			return DEARER_WIN;
		} else {
			return PUSH;
		}
		
	}

}
