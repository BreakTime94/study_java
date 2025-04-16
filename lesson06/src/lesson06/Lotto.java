package lesson06;

import java.util.Arrays;

public class Lotto {
	
	public static void main(String[] args) {
		
		int[] lotto = new int [6]; // 0이 6개있는 배열 생성
				
		int idx = 0; 
		
		while (true) { // 무한루프
			
			int number =(int)(Math.random() * 45 + 1); // 난수 뽑고 45를 곱하면 0 <= number < 45 1을 더하면 1 <= number < 46 사이 정수는 1부터 45 
		
			boolean insert = true;
			
			for (int i = 0; i <= idx; i++) {
				
				
				if(lotto[1] == number) { // 한번만 
					insert = false;
					break;
				}
				
			}
			
			if (insert) {
				lotto[idx] = number;
				idx++;
			}
			if(idx == 6) break;
		}
//		System.out.println(Arrays.toString(lotto));

		int[] arr = lotto;
		
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.println(i + 1 + "회차");
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		
		}
//		int [] arr2 = {5, 4, 2, 3, 1};
//		Arrays.sort(arr2, (a, b) -> (b - a));;
	}
}
