package quiz;

import java.util.ArrayList;
import java.util.Collections;

public class D08_CountFruits {

	// 크기 1000의 String[]의 만들고 다음의 과일들을 무작위로 추가한 후
	// 해당 배열 내부에 각 과일이 몇 개씩 들어있는지 출력해보세요
	
	final public static String[] FRUITS =
		{"Apple","Banana","Orange","Mango","Kiwi","Pineapple",
			"Peach","WaterMelon", "Grape"};
	
	public static void main(String[] args) {
		String [] ranFruit = new String[1000];
		
		int appleCount = 0;
		int bananaCount = 0;
		int orangeCount = 0;
		int mangoCount = 0;
		int kiwiCount = 0;
		int pineappleCount = 0;
		int peachCount = 0;
		int waterMelonCount = 0;
		int grapeCount = 0;
		
		ArrayList<String> list = new ArrayList<>(); 
		
		for(int i = 0; i < ranFruit.length; ++i) {
			int ran = (int)(Math.random() * FRUITS.length);
			ranFruit[i] = FRUITS[ran];
			
			list.add(ranFruit[i]);
			
			if(ranFruit[i].equals("Apple")) {
				appleCount++;
			}
			if(ranFruit[i].equals("Banana")) {
				bananaCount++;
			}
			if(ranFruit[i].equals("Orange")) {
				orangeCount++;
			}
			if(ranFruit[i].equals("Mango")) {
				mangoCount++;
			}
			if(ranFruit[i].equals("Kiwi")) {
				kiwiCount++;
			}
			if(ranFruit[i].equals("Pineapple")) {
				pineappleCount++;
			}
			if(ranFruit[i].equals("Peach")) {
				peachCount++;
			}
			if(ranFruit[i].equals("WaterMelon")) {
				waterMelonCount++;
			}
			if(ranFruit[i].equals("Grape")) {
				grapeCount++;
			}
			
		}
		System.out.println(list);
		System.out.println();
		//
		System.out.println("------------------------------------");
		System.out.println("총 과일의 개수는 " + list.size() + "개");
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println("###Collections.frequency로 구하기###");
		System.out.println("사과의 개수는 " + 
				Collections.frequency(list, "Apple") + "개");
		System.out.println("바나나의 개수는 " + 
				Collections.frequency(list, "Banana") + "개");
		System.out.println("오렌지의 개수는 " + 
				Collections.frequency(list, "Orange") + "개");
		System.out.println("망고의 개수는 " + 
				Collections.frequency(list, "Mango") + "개");
		System.out.println("키위의 개수는 " + 
				Collections.frequency(list, "Kiwi") + "개");
		System.out.println("파인애플의 개수는 " + 
				Collections.frequency(list, "Pineapple") + "개");
		System.out.println("복숭아의 개수는 " + 
				Collections.frequency(list, "Peach") + "개");
		System.out.println("수박의 개수는 " + 
				Collections.frequency(list, "WaterMelon") + "개");
		System.out.println("포도의 개수는 " + 
				Collections.frequency(list, "Grape") + "개");
		
		System.out.println();
		
		System.out.println("### if문으로 구하기 ###");
		System.out.println("사과의 개수는 " + appleCount + "개");
		System.out.println("바나나의 개수는 " + bananaCount + "개");
		System.out.println("오렌지의 개수는 " + orangeCount + "개");
		System.out.println("망고의 개수는 " + mangoCount + "개");
		System.out.println("키위의 개수는 " + kiwiCount + "개");
		System.out.println("파인애플의 개수는 " + pineappleCount + "개");
		System.out.println("복숭아의 개수는 " + peachCount + "개");
		System.out.println("수박의 개수는 " + waterMelonCount + "개");
		System.out.println("포도의 개수는 " + grapeCount + "개");
	}
	
	
}
