package lesson05;

public class SwitchEx {

	public static void main(String[] args) {
		
		// 요일 계산, 0 일요일 , 6 토요일
		
		int day = -1; 
		
		switch (day) {
		
		case 0 : 
			System.out.println("오늘은 일요일!");
			break;
		case 1 : 
			System.out.println("오늘은 월요일!");
			break;
		case 2 : 
			System.out.println("오늘은 화요일!");
			break;
		case 3 : 
			System.out.println("오늘은 수요일!");
			break;
		case 4 : 
			System.out.println("오늘은 목요일!");
			break;
		case 5 : 
			System.out.println("오늘은 금요일!");
			break;
		case 6 : 
			System.out.println("오늘은 토요일!");	
			break;
			
		default : 
			System.out.println("유효하지 않습니다. 0 ~ 6사이 수를 다시 입력하세요!");
		
		}
		
	}
	
}
