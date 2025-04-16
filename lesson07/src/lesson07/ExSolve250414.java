package lesson07;

import java.util.Arrays;

public class ExSolve250414 {
	public static void main(String[] args) {
		//피보나치 수열, 선생님 풀이
		
		int a = 1;
		int b = 1;
		for(int i = 0; i < 18; i++) {
			int c = a + b;
			System.out.println(c + " ");
			a = b;
			b = c;
		}
		
		//50개의 길이를 가지는 정수 배열 생성, 각 값은 1 ~ 20 사이의 숫자로 채우기 그 이후, 이후 중복된 값을 제거한 새로운 배열을 생성
		
		int[] arr = new int[50];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20 + 1);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] tmp = new int[20];
		int length = 0;
		
		for(int n : arr) { // 복습하자, 이 과정을 통해서 나오지 않은 값 만큼 tmp의 배열이 0 0 0이 된다.
			boolean insert = true;
			for(int i = 0; i < length; i++) {
				if(n == tmp [i]) {
					insert = false;
					break;
				}	
			}
			if(insert) {
				tmp[length++] = n; // length++은 length를 넣고 그 이후에 length 값을 늘림
			}
		}
		System.out.println(Arrays.toString(tmp));
		tmp = Arrays.copyOf(tmp, length);
		System.out.println(Arrays.toString(tmp));
		
		// 회전문제
		
		char[][] chs = { // (0,0) -> (0.4) (0,1) -> (1,4) (0,2) -> (2,4) (4,0) -> (0,0) (2,4) -> (4,2) 
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'},
		};
		//90도 시계 방향 회전 결과를 result에 담으시오.
		char[][] result = new char[5][5];
		
		for(int i = 0; i < chs.length; i++) {
			for(int j = 0; j < chs.length; j++) {
				result[j][chs.length - 1 - i] = chs[i][j];
			}
		}
		for(char[] t : result) {//result는 2차원 char 배열, char[] t는 1차원 char 배열
			for(char n : t) { // t는 1차원 char 배열, n은 char형 타입
				System.out.print(n);
			}
			System.out.println();
		}
			
		//문제가 어렵다면, 값의 범위를 줄여서 시도해보자. 의외로 패턴을 쉽게 찾을 수 있다.
		

	}
}
