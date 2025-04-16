package lesson04;

public class OpExTen {

	public static void main(String[] args) {
		// 1번문제
		
			int candy = 72;
			int hum = 6;
			
			System.out.println(candy + "개의 사탕을 " + hum + "명의 사람이 나눠 가질 때, 한 사람당 받게 될 사탕의 수 : " + (candy/hum));
			
//			System.out.println(72/6);
			
			// 2번문제
			
			int cup = 23;
			hum = 4;
			
			System.out.println(cup + "개의 컵 케이크를 " + hum + "명이 똑같이 나눠 가질 때 남는 컵케이크의 수 : " + (cup % hum));
			
//			System.out.println(23 % 4);
			
			//3번문제
			
			int hei = 148;
			boolean rid = hei >= 150 ; 
			System.out.println("키가 " + hei + "인 사람은 놀이기구를 탈 수 있다? " + rid );
			
			//4번문제
			
			int score = 10;
			
			score += 20;
			
			System.out.println("현재 점수는 " + score + "점 입니다.");
			
			//5번문제
			
			int lev = 3;
			lev ++;
			lev ++; 
			lev --;
			System.out.println("현재 레벨은 " + lev + "입니다.");
			
			//6번문제 보완 필요해보임. 변수의 값이 바뀌면 달라지게 되는 것을 보여야 함.
			
			boolean hasID = true;
			boolean hasTicket = false; 
			
			
			boolean canEnter = (hasID  && hasTicket) ; // 어차피 && 연산자는 둘 다 참이여야 하므로 그냥 옆처럼 표시해도 가능
			System.out.println("입장 가능할까요? " + canEnter);
			
			//7번문제
			
			int kor = 80;
			int mat = 90; 
			int eng = 70; 
			
			int avg = (kor + mat + eng)/3 ;
			
			System.out.println("평균점수 : " + avg); 
			
			//8번문제
			
			int age = 21; 
			boolean isRegistered = true;
			
			boolean site = (age >= 20 && isRegistered) ;
			
			System.out.println("정답은 : " + site);
			
			//9번문제
			
			double point = 10;
			point *= 3;
			point += 5;
			point /= 3; 
			
			System.out.println("최종 점수는 : " + point); //딱히 소수점 언급이 없으면 정수만 해도 됨.
			
			//10번 문제
			
			age = 20; 
			hasTicket = true;
			boolean isVIP = false;
			
			canEnter = age >= 18 && hasTicket && !isVIP ;
			
			System.out.println("들어갈 수 있을까요? " + canEnter); 
			
			//윤년 계산은 매우 어렵.
			
		
		
	}
	
}
