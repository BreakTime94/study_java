package lesson05;

import java.util.Scanner;

public class ExRev250409 {

	public static void main(String[] args) {
		
		//27명 5다스 문제 
		
		int colorPen = 5 * 12;
		int studentCount = 27;
		
		int divColorPen = colorPen / studentCount;
		int remainColorPen = colorPen % studentCount;
		
		System.out.println(divColorPen);
		System.out.println(remainColorPen);
		
		
		// 놀이공원 문제 : 나이, 키 , 부모님, 심장병 4개 변수
		 
		int age = 10 , height = 150 ;
		boolean parent = false, heartDease = false;
		
		//boolean isRide = !heartDease && height >= 120 && (age >= 6 ? true : parent) ;
		boolean isRide = !heartDease && height >= 120 && (age >= 6 || parent) ;
		//boolean isRide = !heartDease && height >= 120 && age >= 6 || parent ; 심장병이 있든 없든 부모님만 있으면, 무조건 입장가능이란 의미가 되어버림
		
		System.out.println(isRide);
		
		// 윤년체크 
		//경계값 테스트는 항상 필요하다. 조건 하나하나씩 처리
		
		int year = 2025;
		
		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
		// 왜 또는이 들어갈까?
		System.out.println(leapYear);
		
		// 187000원 지폐 지불하기
		
		int price = 187000;
		int oman = 187000 / 50000;
		int ilman = 187000 % 50000 / 10000; // 굳이 나머지를 2번 할 필요가 없다.
		int ochun = 187000 % 10000 / 5000;
		int ilchun = 187000 % 5000 / 1000;
		
		//연산자의 우선순위를 잘 알기 위해서, 
		
		System.out.println(oman);
		System.out.println(ilman);
		System.out.println(ochun);
		System.out.println(ilchun);
		
		// 정수타입 변수 자릿수 없애기 
		
		int number = 1234; 
		
		int result = number / 100 * 100 ;
		//int result = number - number % 100;
		
		// 로그인 인증 아이디 비밀번호 입력받고, admin, 1234일 때 로그인 성공 아이디만 성공 했을 때, ID 도 실패했을 때 등으로 나누면 됨
		
		Scanner scanner = new Scanner(System.in);
		
		String id = "";
		
		String pw = "";
		
		System.out.println("아이디를 입력하세요 >");
		
		id = scanner.nextLine(); // next Line next Int 혼합해서 안 씀!
		
		System.out.println("입력한 ID는 " + id + "입니다."); //전화번호부 입력할 때는, String으로 해야한다. 0으로 시작한 숫자 ex) 010-xxxx-xxxx 이기 때문에
		
		System.out.println("패스워드를 입력하세요 >");
		
		pw = scanner.nextLine();
		
		// .equals() 로 확인한다!
		
		if (!id.equals("admin")) { // 없는 계정
			
			System.out.println("없는 계정입니다.");
			
		} else if (pw.equals("1234")) { //로그인 성공
			
			System.out.println("로그인 성공입니다.");
		
		} else {
			
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
		// 숫자 하나 입력 받아서 3의 배수, 짝수, 아닌지 확인, 2비트 마스킹? 도 가능합니다.
		
		int input = scanner.nextInt();
		
		boolean 삼의배수 = input % 3 == 0; 
		boolean 짝수 = input % 2 == 0; 
		
		if (삼의배수 && 짝수) {
			
			
		} else if(삼의배수) {
			
			
			
		} else if(짝수) {
			
			
			
		} else { // A U B 의 바깥 부분 집합을 그려보면서 하는 것도 좋은 연습 일듯.
			
			
		}
		// 비트 마스크 플래그  
		// 3의 배수 1 , 짝수면 2 둘다 만족하면 3 
		result = 0; 
		
		result += 삼의배수 ? 1 : 0;
		
		result += 짝수 ? 2 : 0;
		
		String str = "";
		
		switch (result) {
		
		case 1 : 
			str += "3의 배수";
			break;
		case 2 : 
			str += "짝수";
			break;
		case 3 :
			str += "3의 배수면서 짝수";
			break;
		default :
			str += "둘 다 아닌 수";
			
		}
		System.out.println(str);
		
		input = scanner.nextInt();
		str = "";
		switch (input) {
		
		case 3: case 4: case 5: 
			str = "봄";
			break;
		case 6: case 7: case 8: 
			str = "여름";
			break;
		case 9: case 10: case 11: 
			str = "여름";
			break;
		case 12: case 1: case 2: 
			str = "여름";
			break;
		default :
			str = "잘못했음";
		}
		System.out.println(str);
		
		
	}
}