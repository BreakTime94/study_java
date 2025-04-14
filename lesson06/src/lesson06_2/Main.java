package lesson06_2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int a = 10; // main이 관할하는 변수는 총 4개 a, c, arr, arr2
		int c = a;
		int[] arr = {1, 2, 3};
		int[] arr2 = arr;
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(arr);
		System.out.println(arr2);
		
		//복습 무조건 해야함.
		int[][] arr3 = {{1, 2}, {3}};
		arr3[1] = arr; //int 1차원 배열 가능
		arr3[1] = arr3[0]; //얘도 가능
	
		System.out.println(Arrays.deepToString(arr3)); //주소 값을 복사한거임
		
		arr3[0][0] = 10; // arr3[0]의 주소값과 arr3[1]의 주소값이 동일하므로, 10을 하나만 바꿔도 둘 다 앞자리가 10으로 바뀜
		System.out.println(Arrays.deepToString(arr3));
		arr3[0] = arr;
		System.out.println(Arrays.deepToString(arr3));
		//의도적으로 참조를 끊는 값은 null 값이다.
	}
}
