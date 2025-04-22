package lesson12_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.*; // Calendar. 을 생략할 수가 있다.

import java.text.SimpleDateFormat;

import static java.lang.System.*;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal1 = getInstance();
		Calendar cal2 = new GregorianCalendar();
		
		Scanner scanner = new Scanner(in);
		
		out.println(); //system도 생략 가능
		
		out.println(cal1);
		out.println(cal1.get(ERA));
		out.println(cal1.get(YEAR)); //getter는 setter보다 항상 파라미터가 한 개가 적다.
		out.println(cal1.get(MONTH)); //1월이 0부터
		out.println(cal1.get(DATE)); //day of month == date , day of week == 요일 
		out.println(cal1.get(HOUR));
		out.println(cal1.get(MINUTE)); 
		out.println(cal1.get(SECOND)); 
		out.println(cal1.get(DAY_OF_WEEK)); // 요일 1부터 일요일 
		out.println(cal1.get(DAY_OF_WEEK_IN_MONTH)); // 
	
		System.out.println("============");
		cal1.getActualMaximum(MONTH); //실제 가장 큰 값이 뭐냐? MONTH면 0~11 중 11(12월)이 나온다.
		System.out.println(cal1.getActualMaximum(DATE)); // 현재 값이 5월이므로 5월은 31일까지 있다는 뜻
//		cal1.set(0, 0);
		cal1.add(MONTH, -10); // cal1 값을 기준으로 150 개월을 더해주세요. 음수 값도 적용 가능 
		printcal(cal1);
		
		cal1.roll(MONTH, -10); // 올림수를 계산하지 않고 월만 건드리는 경우
		printcal(cal1);
	}
	
	static void printcal(Calendar cal) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
	}
}
