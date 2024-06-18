package myobj;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class EventDays {

	final private static HashMap<Integer, List<Calendar>> EVENTDAYS =
			new HashMap<>();
	
	static {
		List<Calendar> holidays2024 = new ArrayList<>();
		
		Calendar 신정 = Calendar.getInstance();
		Calendar 구정 = Calendar.getInstance();
		Calendar 구정2 = Calendar.getInstance();
		Calendar 삼일절 = Calendar.getInstance();
		Calendar 국회의원선거 = Calendar.getInstance();
		
		신정.set(2024, 1, 1);
		구정.set(2024, 1, 9);
		구정2.set(2024, 1, 12);
		삼일절.set(2024, 2, 1);
		국회의원선거.set(2024, 3, 10);
		
		holidays2024.add(신정);
		holidays2024.add(구정);
		holidays2024.add(구정2);
		holidays2024.add(삼일절);
		holidays2024.add(국회의원선거);
		
		EVENTDAYS.put(2024, new ArrayList<>());
		
		EVENTDAYS.put(2025, new ArrayList<>());
	}
	
	public static boolean isHoliday(Calendar day) {
		int year = day.get(Calendar.YEAR);
		int mon1 = day.get(Calendar.MONTH);
		int date1 = day.get(Calendar.DATE);
		
		
		List<Calendar> holidayList = EVENTDAYS.get(year);
		
		for(Calendar holiday : holidayList) {
			int mon2 = holiday.get(Calendar.MONTH);
			int date2 = holiday.get(Calendar.DATE);
			
			if(mon1 == mon2 && date1 == date2) {
				
				return true;
			}
		}
		return false;
		
	}
		
}
