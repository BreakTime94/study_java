package lesson05;

import java.util.Scanner;

public class Ex250409 {

	public static void main(String[] args) {
		
		//교재 79 ~ 81의 3, 4, 5, 6, 7 번은 풀기 
		
		//교재 3번 색연필 분배 문제
		
		int colorPen = 5 * 12 ;
		
		int studentCount = 27;
		
		int divColorPen = colorPen / studentCount ;
		
		System.out.println("학생당 나눠가지는 색연필수 :" + divColorPen);
		
		int remainColorPen = colorPen % studentCount; 
		
		System.out.println("똑같이 나눠가지고 남은 색연필수 :" + remainColorPen);
		
		//교재 4번 놀이동산 아이 나이, 신장, 심장병, 어릴 때는 부모 동반여부 
		// 조건 1) 이 6세 미만이어도 키 120 이상이면 탑승 가능하다는 뜻일 듯.
		
		int age = 6; 
		
		int height = 120;
		
		boolean parent = true;
		
		boolean heartDease = false;
		
//		boolean canEnter = (age >= 6 && height >= 120 && !heartDease) || (age < 6 && height >=120 && parent && !heartDease) ; 
		//boolean canEnter = (!heartDease && height >=120) && (age >=6 ? true : parent ? true : false));
		boolean canEnter = !heartDease && height >=120 && (age >=6 ? true : parent);
		
		System.out.println("당신의 입장 결과는 ->" + canEnter);
		
		//교재 5번 윤년 계산문제, 4로 나누어 떨어지면서 100으로는 안 나누어 떨어지면서 400으로는 나누어 떨어지는문제
		// 100으로 나눠 떨어지고 400으로 안 나누어 떨어지는게 맞는거 아닌가
		int year = 2020;
		
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) && year % 400 == 0 ;
		
		//윤년이면 true, 윤년이 아니면 false
		
		System.out.println(leapYear);
		
		//교재 6번 187,000원을 가장 적은 지폐 수량으로 처리하는 코드 작성
		
		int price = 187000;
		
		int oman = 187000 / 50000;
		
		int ilman = 187000 % 50000 / 10000;
		
		int ochun = ((187000 % 50000) % 10000) / 5000;
		
		int chun = (((187000 % 50000) % 10000) % 5000) / 1000;
		
		
		System.out.println("5만원권 : " + oman + "장");
		System.out.println("1만원권 : " + ilman + "장");
		System.out.println("5천원권 : " + ochun + "장");
		System.out.println("1천원권 : " + chun + "장");
		
		//교재 7번 정수타입 변수 number에서 십의 자리 이하 버리는 코드 작성 1234 -> 1200 으로 
		
		int number = 1234;
		
		int result = number - number % 100;
		
		
		System.out.println(result);
		
		
		
		
		
		// 추가문제1 어려움 로그인인증
		//사용자로부터 아이디와 비밀번호를 입력 받고, 그 아이디가 admin, 비밀번호가 1234일 때 로그인 성공
		// 아이디가 admin 비밀번호가 틀렸을 때, 로그인 실패 > 잘못된 비밀번호 
		// 아이디가 admin이 아니면 없는 계정 메세지 출력 
		
		String identity = "admin";
		String passWord = "1234";
		
		System.out.print("띄어쓰기 없이 ID를 입력하세요. >");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputId = scanner.nextLine();
		
		
		if (inputId.equals(identity)) {
			
			System.out.print("비밀번호를 입력해주세요. >");
			
			String inputPw = scanner.nextLine();
			
			if (inputPw.equals(passWord)) {
			
				System.out.println("로그인 성공");
				
			} else {
				System.out.println("로그인 실패 > 잘못된 비밀번호입니다. ");
				
			}
			
		} else {
			System.out.println("없는 계정입니다.");
			
		}
		
		// 추가문제 2 쉬움 
		// 숫자 하나를 입력 받아서 3의 배수 그리고 짝수 여부를 동시 판별
		// 3의 배수, 짝수, 3의배수이면서 짝수, 둘 다 아닌 경우
		
		System.out.print("숫자를 입력해주세요. >");
		int input = scanner.nextInt();
		
		if (input % 3 == 0) {
			
			if (input % 2 == 0){ 
				
				System.out.println("3의 배수이면서 짝수로군요.");
			}
				System.out.println("3의 배수이지만 짝수는 아닙니다.");
				
			} else if (input % 2 == 0) {
				
			System.out.println("짝수입니다.");
			
		} else {
			
			System.out.println("짝수도 아니고 3의 배수도 아닙니다.");
		}
		
		
	
		// 추가문제 3 월을 입력받아서 계절을 출력
		// 3, 4, 5 봄 12, 1, 2 겨울 6, 7, 8 여름 9, 10 ,11 가을..? switch 를 사용하면 괜찮을 듯! 
		
		System.out.print("월을 입력해주세요. >");
		input = scanner.nextInt();
		
		switch (input) {
		
		case 12 : case 1: case 2 : System.out.println("겨울입니다.");
		break; 
		
		case 3 : case 4 : case 5 : System.out.println("봄입니다."); 
		break;
		
		case 6 : case 7 : case 8 : System.out.println("여름입니다."); 
		break;
		
		case 9 : case 10 : case 11 : System.out.println("가을입니다."); 
		break;
		
		default : 
			System.out.println("1 ~ 12 사이 숫자를 입력해주세요.");
		}
		
	}
}
