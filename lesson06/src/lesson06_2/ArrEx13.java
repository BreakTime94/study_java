package lesson06_2;

import java.util.Arrays;

public class ArrEx13 {
	public static void main(String[] args) {
		//초기 배열
		//5개의 int 배열 생성
		int[] arr = {10, 20, 30, 40, 50};
		
		// 기존 배열의 2배의 길이를 가지는 배열 생성
		// 보통 배열은 2배씩 늘린다(효율의 문제)
		int[] tmp = new int[arr.length * 2]; // 10개짜리 배열 {0, 0, 0, 0, 0, 0, ...., 0}
//		
//		for (int i = 0; i < arr.length; i++) {
//			tmp[i] = arr[i];
//		}
//		//배열의 참조값 복사
//		arr = tmp;
//		
//		System.out.println(Arrays.toString(arr)); // 배열의 길이를 2배로 늘렸다. 
		
		//
		System.arraycopy(arr, 1, tmp, 2, 3); 
		// 첫번째 arr : 복사할 주체의 배열(원본), 
		// 두번째 0 : 몇 번 index부터 복사할 것인가?
		// 세번째 tmp : 덮어씌울 배열 
		// 네번째 0 : 덮어씌울 배열의 시작 위치
		// 다섯번째 0 : 몇개 복사?
		arr = tmp;
		System.out.println(Arrays.toString(arr)); // 배열의 길이를 2배로 늘렸다. 
		
		//for문 복사, arraycopy를 이용한 복사는 덮어씌울 대상을 미리 생성(tmp 배열)
		
		int[] arr2 = Arrays.copyOf(arr, 20); //뒤에 20은 배열 길이
		System.out.println(Arrays.toString(arr2));
		
		
		int[] result = {1, 2, 3};
		result = Arrays.copyOf(result, result.length * 2);
		
		System.out.println(Arrays.toString(result));
		
		
	}
}
