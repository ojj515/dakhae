package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class D08_CountFruits_a {

	// 크기 1000의 String[]의 만들고 다음의 과일들을 무작위로 추가한 후
	// 해당 배열 내부에 각 과일이 몇 개씩 들어있는지 출력해보세요
	
	final public static String[] FRUITS =
		{"Apple","Banana","Orange","Mango","Kiwi","Pineapple",
			"Peach","WaterMelon", "Grape"};
	
	public static void main(String[] args) {
		String [] ranFruit = new String[1000];
		
		for(int i = 0; i < ranFruit.length; ++i) {
			ranFruit[i] = FRUITS[(int)(Math.random() * FRUITS.length)];
		}
		
		// 과일 9개 X 배열 크기 1000번 = 총 9000번 반복
		for(int i = 0; i < FRUITS.length; ++i) {
			System.out.print(FRUITS[i] + "의 개수: ");
			
			int count = 0;
			
			for(int j = 0; j < ranFruit.length; ++j) {
				if(ranFruit[j].equals(FRUITS[i])) {
					++count;
				}
			}
			System.out.println(count + "개");
		}
		
		List<String> ranFruitList = new ArrayList<>(Arrays.asList(ranFruit));
		
		
		System.out.println("### Collections.frequency를 사용###");
		
		// 과일 9개 X frequency로 1000번씩 = 총 9000번 검사
		for(int i = 0; i < FRUITS.length; ++i) {
			String fruit = FRUITS[i];
			int count = Collections.frequency(ranFruitList, fruit);
			System.out.printf("%s의 개수: %d개\n", fruit,count);
		}
		
		// 반복을 1000번만 수행하면서 모든 과일의 개수를 셀 수 있다
		HashMap<String, Integer> fruitCount = new HashMap<>();
			for(int i = 0; i < ranFruit.length; ++i) {
				String fruit = ranFruit[i];
				
				// 아직 없는 과일이라면 get()했을 때 null이 나온다
				// 이미 맵에 등록된적 있는 과일이라면 개수가 나온다
				Integer count = fruitCount.get(fruit);
				
				if(count != null) {
					fruitCount.put(fruit, count + 1);
				} else {
					fruitCount.put(fruit, 1);
				}
				
			}
			System.out.println(fruitCount);
			
			
	
	}
	
}
