package lesson06;

public class MinMax {

	public static void main(String[] args) {
		// 최대값, 최소값 구하기 이것도 복습!!
		int[] arr = {10, 1, 3, 5, 6};
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 1 ; i < arr.length ; i++) { // 한번씩 비교
			
			if(max < arr [i]) {
				
				max = arr[i];
				
			} 
			else if (min > arr[i]) {
				
				min = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		//합계, 평균
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println("index 값 " + i + " sum 값 " + sum);
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : "+ sum / arr.length);
	}
		
}

