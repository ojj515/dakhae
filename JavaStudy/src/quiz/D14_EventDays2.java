package quiz;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class D14_EventDays2 {
	
	/* java.time 패키지의 클래스들만 활용하여
	 * 
	 *  실행하면 오늘부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는
	 *  프로그램을 만들어보세요
	 * 
	 * 1+1 이벤트 : 매 월 18일
	 * 20% 할인 이벤트 : 홀수번째 주 금요일
	 * 구매시 아메리카노 무료 이벤트 : 매주 화요일
	 * 
	 *  ※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다
	 */
	
	public static void printEventDays2() {
		LocalDate now_d = LocalDate.now();
		
		
		
		for(int i = 0; i <365; ++i) {
			System.out.printf("[%s]의 이벤트\n", 
					now_d.plusDays(i));
			
			boolean eventExist = false;
			
			// 매월 18일
			if(now_d.plusDays(i).getDayOfMonth() == 18) {
				System.out.println("-1+1 이벤트");
				eventExist = true;
			}
			
			if(now_d.plusDays(i).getDayOfWeek() == DayOfWeek.FRIDAY) {
				if(eventExist) {
					System.out.println("-20% 할인 이벤트");
				} else {
					System.out.println("-20% 할인 이벤트");
					eventExist = true;
				}
			}
			
			if(now_d.plusDays(i).getDayOfWeek() == DayOfWeek.TUESDAY) {
				if(eventExist) {
					System.out.println("-구매시 아메리카노 무료");
				} else {
					System.out.println("-구매시 아메리카노 무료");
					eventExist = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		printEventDays2();
	}
}
