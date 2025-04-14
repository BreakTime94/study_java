package lesson07;

import java.util.Arrays;

public class Ex250414 {
	public static void main(String[] args) {
		// 1. 피보나치 수열 출력 (반복문)
		// 1 1 2 3 5 8 13 21 34 55 89 144 233 (a1 + a2 == a3) n 을 점차 늘려서
		
		int fib1 = 1;
		int fib2 = 1;
		for(int i = 0; i <= 17; i++) {//항 갯수
			int fib = fib1 + fib2 ;
			fib1 = fib2;
			fib2 = fib;
			System.out.println((i + 3) + "항의 값은" + fib);
		}
		
		//2. 임의의 값 범위를 정하여 50개짜리 배열을 만들고 중복을 제거하여 배열 만들기 (1 ~ 20의 숫자)
		// 새 배열을 만들어서 담으면 됨
		int[] arr = new int[50];
		
		for(int i = 0; i < arr.length; i++) { //최초 배열
			arr[i] = (int)(Math.random() * 20 + 1);
		}
		System.out.println(Arrays.toString(arr));
		int[] tmp = new int[20];
		for(int i = 0; i < arr.length; i++) {
			tmp[arr[i] - 1]++;
		}
		System.out.println("중복된 숫자 카운트 " + Arrays.toString(tmp));
		
		for(int i = 0; i < tmp.length; i++) {
			if(tmp [i] !=0) {
			tmp[i] = i+1;
			}
		}
		System.out.println("중복 없애고 값 부여 " + Arrays.toString(tmp));
		
		
		//3. 2차원 배열(어려움)
//		*
//		* **
//		* **
//		* **
//		* *****
//		* *****
//		* 
		char[][] chs = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'},
		};
		//90도 시계 방향 회전 결과를 result에 담으시오.
		char[][] result = new char[5][5];
//		System.out.println(chs[1]);// **___
		for(int i = 0; i <chs.length; i++) {
		System.out.println(chs[i]);
		}
		System.out.println();
		for(int i = 0; i < chs.length; i++) {
			for(int j = 0; j < chs[i].length; j++) {
				chs[j][4-i] = chs[i][j];
			}
		System.out.println(chs[i]);	
		}
		
	}
}
