package lesson06;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		
		//정렬
		//버블정렬
		// {3, 4, 1, 5, 2} 이 있으며, 이 친구를 정렬해보겠다. 
		// 0번과 1번 , 1번 2번 비교 등 꼭 하나씩 진행한다.
		//{3, 4, 1, 5, 2}
		//{3, 1, 4, 5, 2}
		//{3, 1, 4, 5, 2}
		//{3, 1, 4, 2, 5} 1회차 끝!
		
		//회차가 끝날 때 마다 마지막 자리에서 부터 확정 됨
		
		// 2회차
		//{1, 3, 4, 2, 5} 3 1 비교해서 바뀜
		//{1, 3, 4, 2, 5} 3 4 비교해도 안 바뀜
		//{1, 3, 2, 4, 5} 4 2 비교해서 자리가 바뀜

		// 3회차
		
		//{1, 3, 2, 4, 5} 1 3 비교해도 안 바뀜
		// {1, 2, 3, 4, 5} 3과 2는 비교하면 바뀜
		
		// 4회차 
		
		// {1, 2, 3, 4, 5} 끝
		
		// 복습 필요
		
		int[] arr = {5, 4, 3, 2, 1, 6};
		
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
	}
	
}
