package lesson05;

public class DoWhileEx {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while (i <= 100);
		
		System.out.println("합계 : " + sum);
		
		// 일부러 거짓 조건으로 만들어보자
		
		int sum2 = 0;
		
		int j = 1;
		
		do {
			sum2 += j;
			j++;
		} while (false);
		
		System.out.println("합계 : " + sum2);
		
		// do while 추가 연습문제 ex) 술게임 소주 뚜껑 업 & 다운
		
		
		
	}
}
