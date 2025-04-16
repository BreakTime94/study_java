package lesson06_2;

import java.util.Arrays;
import java.util.Iterator;

public class ArrEx16 {
	public static void main(String[] args) {
		int[] arrInt = {1, 2, 3, 4, 5};
		
		//index for
		// 배열 내부의 값을 변경 가능
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = arrInt.length - arrInt[i];
			System.out.println(arrInt[i]);
		}
		//;로 구분하지 않고 :로 구분
		// number는 index를 뜻하지 않고, 값을 나타내며 하나씩 나타냄.
		// 값 변경 불가
		System.out.println();
		for(int number : arrInt) {//향상된 for문이라고 불림(Enhanced for)
			number = 10;
			System.out.println(number);
		}
		System.out.println(Arrays.toString(arrInt));
		
		int[][] arr = {{1,2,3}, {4,5}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		for(int[] tmp : arr) { // 값을 조회하는 것에 초점 2차원 배열이기 때문에 1차원 int 배열값이 변수로 들어감
			for(int n : tmp) {
				System.out.println(n);
			}
		}
		String name = "1234";
		String name2 = "1234";
		String n = new String("1234"); //정식 문법
		System.out.println("=================");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(n);
		System.out.println(name == name2);
		System.out.println(name == n); //결과값이 false가 나옴 왜냐? 저장된 주소값이 다르기 때문이다.
		
		System.out.println(n.intern() == name.intern());
		System.out.println(n.equals(name));// 문자열 값 하나 하나를 비교하여 확인함
		
	}
}
