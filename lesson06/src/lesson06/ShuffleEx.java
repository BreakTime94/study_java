package lesson06;

import java.util.Arrays;

public class ShuffleEx {

	public static void main(String[] args) {
		
		int [] arr = new int [45]; 
		
		for (int i = 0; i < arr.length; i++) { // arr.length는 배열의 길이 45개 조건식에 =가 안 들어갔으므로, 0 ~ 44까지다.
			arr[i] = i + 1; // [1, 2, 3, 4, 5, .... 44, 45] index 자리 0 자리에 1 배치, 1 자리에 2 배치 
		}
		
		for(int i = 0; i < arr.length; i++) { // index 변수를 활용한 for문
			int idx = (int)(Math.random() * 45); // int 타입으로 index를 idx 변수로 랜덤으로 뽑는 조건 설정
			
			int tmp = arr[i]; // 각 인덱스에 있는 값들의 위치 교환 방법 변수 3개 활용
			arr[i] = arr[idx];
			arr[idx] = arr[tmp];
			
		}
		int[] result = new int [6];
		for (int i = 0; i <result.length; i++) {
			
			result[i] = arr[i];
		}
		
		
		System.out.println(Arrays.toString(result));
		
		
	}
}
