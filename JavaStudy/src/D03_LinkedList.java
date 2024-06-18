import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class D03_LinkedList {

	/*
	 * 
	 * # LinkedList
	 * 
	 * - ArrayList보다 데이터의 추가/삭제 속도가 더 빠른 리스트
	 * - 각 데이터 덩어리(노드)가 다음 데이터와 이전 데이터의 위치를 함께 보관한다
	 * - ArrayList와 같은 List 인터페이스이기 때문에 사용법은 거의 똑같다
	 */
	
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList();
		
		fruits.add("strawberry");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mandarin");
		
		// addFirst(data), addLast(data)
		fruits.addFirst("watermelon");
		fruits.addLast("watermelon");
		
		// add(index, data) : 원하는 위치에 데이터 추가
		fruits.add(3, "coconut");
		
		// remove() : 맨 앞의 데이터(head)를 지운다
		fruits.remove();
		
		// remove(index) : 맨 앞의 데이터(head)를 지운다
		fruits.remove(2);
		
		//removeFirst(), removeLast()
		fruits.removeFirst();
		fruits.removeLast();
		
		System.out.println(fruits);
		
		// ArrayList와 LinkedList는 모두 List 인터페이스 소속이기 때문에
		// List로 업캐스팅 하여 활용하다
		List<String> list1 = new LinkedList();
		List<String> list2 = new ArrayList();
		
		list1.add("무궁화호");
		list1.add("새궁화호");
		list1.add("통일호");
		
		// 더 거슬러 올라간다면 컬렉션까지 갈 수 있다
		// List와 Set은 Collection 인터페이스의 자식 인터페이스이다
		Collection<String> col1 = new LinkedList<>();
		Collection<String> col2 = new HashSet<>();
		
		// 모든 컬렉션은 배열로 변환될 수 있다
		String [] str = new String[list1.size()];
		list1.toArray(str);
		
		String [] arr = list1.toArray(new String[list1.size()]);
		Object [] arr2 = list1.toArray();
		
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(arr2));
		
		// 업캐스팅 된 상태이기 때문에 LinkedList만의 메서드는 사용할 수 없는 상태
		// list1.addFirst();
	}
	
}
