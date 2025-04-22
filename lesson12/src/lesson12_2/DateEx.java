package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date(); // 입력값 없으면 현재시각 출력 ms 단위
		
		System.out.println(now);
		System.out.println(now.toLocaleString()); // ko location kr 영어		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS E a"); //요일 , a는 am pm 정보)
		System.out.println(sdf.format(now));
	}
}
