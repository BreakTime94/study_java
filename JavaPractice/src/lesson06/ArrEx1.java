package lesson06;

import java.util.Arrays;

public class ArrEx1 {

	public static void main(String[] args) {

		int i ;
		i = 10;
		
		int[] arr = new int[] {10, 20, 30, 50}; //값이 초기화가 안된 상태.
		
		
		
//		arr = {}; // 길이가 없는 배열
//		
//		arr = {10, 20, 30};
		
		System.out.println(i); 
		
		System.out.println(arr[0]); // 배열 값 접근 >> index
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		//OS 프로그램을 운영시켜주는 매개체 파일 관리자의 역할도 있다. 
		// 빔프로젝터나 에어팟 등은 운영체제까지 가지 못하고 펌웨어가 들어 있는 경우가 있다. 운영체제를 키는 것 부팅!
		// 안드로이드 iOS 리눅스 기반 
		
		arr[0] = 60; // 0번째 위치에 있는 값을 60으로 바꾼다는 뜻! 
		

		System.out.println(arr[0]); // 배열 값 접근 >> index
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		arr[1] = arr[2]; // 타입만 맞으면 가능 [60, 30, 30, 10]
		
		arr[3] = i; 
		
		for (int j= 0; j <= 3 ; j++) {
			
			System.out.println(arr[j]);	
		}
		
		int[] arr1 = {1, 2, 3}; // 값을 통한 초기화
		
		int[] arr2 = new int[3]; // 길이를 통한 초기화, 인덱스에 배치된 초기 값은 전부 0 {0, 0, 0}
		
		int[] arr3 = new int[] {5, 6, 7, 8};
		
		System.out.println(arr2[2]);
		
		arr1 = new int[] {10, 40, 50};
		arr1 = new int [10]; // 기존에 있는 값인 {1, 2, 3}도 전부 날라간다. {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, }
		
		System.out.println(arr1); // [I@378fd1ac 로 출력, 전체 출력을 하고 싶다면? 아래와 같이!
		System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(arr3)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		
		String[] arr4 = new String[3] ;
				
		System.out.println(Arrays.toString(arr4)); // [null, null, null] 로 표기
		
		char ch = '가';
		
		ch = 44032;
		
		ch = '\uAC00';
		
		ch = 0xac00;
		//'A' >> 65, 'a'>> 97, '0' >> 48
		
	}
}
