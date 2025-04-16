package lesson05;

import java.util.Scanner;

public class SwithEx3 {

	public static void main(String[] args) {
		
		System.out.print("가위(1), 바위(2), 보(3) ! > ");
		
		Scanner scanner = new Scanner(System.in);
		
		int me = scanner.nextInt();
		
		
		int com = (int)(Math.random() * 3 + 1); // 범위는 0이상 3미만 ramdom의 범위는 0 이상 1 미만이기 때문에 여기에 3을 곱하고 캐스팅 (정수 형변환 하면) 0 , 1, 2만 나오니  
		// 1 값을 더 해주면 1, 2, 3이 나오게 될 것이다.
		
		String[] values = {"가위", "바위", "보"};
		
		System.out.println("당신은 : " + values[me -1] + " 컴퓨터는 : " + values[com - 1]);
		
	
		int val = me - com;
				
				switch (val) {
					
					case -2 : case 1 : 
						System.out.println("당신이 이겼습니다!");
						break;
					case -1 : case 2 : 
						System.out.println("당신이 졌습니다!");
						break;
					case 0 : 
						System.out.println("비겼습니다!");
						break;
						
				}
		
			// switch를 활용해 승리, 패배, 무승부 출력
			// 0.0, 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 
			// *3을 하면, 0.0 0.3 0.6 0.9 1.2 1.5 1.8 2.1 2.4 2.7 
			// *6을 하면 0.0 0.6 1.2 1.8 2.4 3.0 3.6 4.2 4.8 5.4
				
	}
}
