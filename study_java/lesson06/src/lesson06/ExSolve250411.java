package lesson06;

import java.util.Arrays;

public class ExSolve250411 {
	public static void main(String[] args) {
		//187000원 배열을 이용해서 장 수 확인하기
		//1. 50000원, 10000원, 5000원, 1000원
		int money = 187000;
		int[] units = {50000, 10000, 5000, 1000};
		int[] count = new int[units.length];

		for(int i = 0; i < units.length; i++) {
			count[i] = money / units[i]; 
			money %= units[i];
			System.out.printf("%d원 %d장\n", units[i], count[i]);
		}
		
		
		System.out.println(Arrays.toString(count));
		System.out.println(money);
		
		
		//2. 임의의 문자열 생성, CAPCHA 생성, 문자열의 범위는 숫자, 영대, 영소 10글자
		String capcha = "";
		//난수의 범위 0 ~ 61
		//0 ~ 9 그대로 숫자, 10 ~ 35까지는 영대, 36 ~ 61까지는 영소
		for(int i = 0; i < 10; i++) {// 10개 뽑는 횟수 담당
			int ch = (int)(Math.random() * 62);
			if(ch < 10) { // 숫자
				capcha += ch;
			}
			else if(ch <36) {//영대 시작 10 실제 값은 A 65 
				capcha+= (char)(ch + 'A' - 10);
			}
			else {//영소 시작값을 36으로 하고 싶지만 실제 a 값은 97이다.  
				capcha+= (char)(ch + 'a' - 36);
				
			}
		}
		System.out.println(capcha);
		// 문자 배열로 풀어보기
		char[] capcha1 = new char[10];
		for(int i = 0; i < 10; i++) {// 10개 뽑는 횟수 담당
			int ch = (int)(Math.random() * 62);
			if(ch < 10) { // 숫자
				capcha1[i] = (char)(ch + '0' - 0);
			}
			else if(ch <36) {//영대 시작 10 실제 값은 A 65 
				capcha1[i] = (char)(ch + 'A' - 10);
			}
			else {//영소 시작값을 36으로 하고 싶지만 실제 a 값은 97이다.  
				capcha1[i] = (char)(ch + 'a' - 36);
				
			}
		}
		System.out.println(capcha1);
		//3. 빈도수 구하기
		//100개의 공간, 범위는 0 ~ 9
		int[] arr = new int[100];
		for(int i = 0; i <arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);			
		}
		System.out.println(Arrays.toString(arr));
		//3-2. 개수를 세보자 0 ~ 9 값을 담을 배열을 새로 만들어 보자.
		
		int[] counts = new int[10];
		for(int i = 0 ; i < arr.length; i++) {
			counts[arr[i]]++;
			//counts[arr[0]]++; counts[arr의 실제 해당하는 값을 부여함] ex)9라고 하면, counts[9]가 되어서 실제 그 값에 해당하는
			//차례에 카운트가 들어감 [0,0,0,0,0,0,0,0,0,1]
			// 범위 값이 늘어나면, counts의 배열의 길이를 늘려서 진행하면 됨
		}
		System.out.println(Arrays.toString(counts));
		
		
	}
}
