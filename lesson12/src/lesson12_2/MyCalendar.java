package lesson12_2;

import java.util.Calendar;
import static java.util.Calendar.*;

import java.text.SimpleDateFormat;

public class MyCalendar { // 꼭 복습하자
	public static void main(String[] args) {
		// 숫자 <> 문자열 상호 변환 이해
		// 숫자 >> 문자열 : format
		// 문자열 >> 숫자 : parse 
		
		// 날짜 <> 문자열 상호 변환 이해
		// 날짜 >> 문자열 : format 
		// 문자열 >> 날짜 : parse 
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(DATE, 1);
		cal.add(MONTH, -1); //메서드로 만들어도 될듯!
		int lastDate = cal.getActualMaximum(DATE);
		int startDate = cal.get(DAY_OF_WEEK);
		System.out.println(startDate - 1);
		int d = startDate -1;
		
		System.out.println(new SimpleDateFormat("yyyy/MM 달력").format(cal.getTime()));
		
		for(int i = 1 - d; i <= lastDate; i++) {
			if(i < 1) {
				System.out.printf("%3c", ' ');
			}
			else {
				System.out.printf("%3d", i); 				
			}
			if(i % 7 == ((7 - d) % 7)) {// 여기가 진짜 어렵다.
				System.out.println();
			}
		}
		
	}
}
