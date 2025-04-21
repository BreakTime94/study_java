package lesson12;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		// 오늘날짜
		//1970.1.1 >> 70. 0. 1 
		Date today = new Date(125, 3, 21); // 125인 이유는 2000년이 넘어갔기에 표시, 3은 4월, 21은 그날 날짜
		// 수료날짜
		Date endDate = new Date(125, 8, 29);
		
//		System.out.println(endDate - today); 이거 형변환 안 해줌
//		System.out.println(endDate.getTime() - today.getTime()); // 단위가 나옴
		
		long duration = endDate.getTime() - today.getTime();
		System.out.println("수료까지 남은 날짜는 : " + duration / 1000 / 60 / 60 / 24 + "일 입니다."); // 1000나누기 초 단위, 60은 분 단위, 60은 시간 단위, 24는 일 단위
		
		Date birthday = new Date(94, 7, 29);
		
		duration = today.getTime() - birthday.getTime() ;
		System.out.println(duration / 1000 / 60 / 60 / 24); //에포크타임은 안 쓰지는 않는다.
	}
	
}
