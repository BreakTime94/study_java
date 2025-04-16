package lesson07;

import java.util.Scanner;

public class TvMain {
	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println("Tv 리모컨이라능~");
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while(running) {
			System.out.println("현재 Tv는 " + (tv.power ? "켜" : "꺼") + "져있습니다.");
			System.out.println("채널은 " + tv.channel + ", 볼륨은 " + tv.volume + "입니다.");
			
			System.out.println("수행할 메뉴를 선택하세요.");
			System.out.println("1. 전원관리 2. 채널업 3. 채널다운 4. 볼륨업 5. 볼륨다운 6. 리모컨 종료");
			int input = scanner.nextInt();
			switch(input) {
			case 1: 
				tv.doPower();
				break;
			case 2: 
				tv.channelUp();
				break;
			case 3: 
				tv.channelDown();
				break;
			case 4: 
				tv.volumeUp();
				break;
			case 5: 
				tv.volumeDown();
				break;
			case 6:
				running = false;
				System.out.println("리모컨을 종료합니다.");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
		
		}
	}
}
