package lesson06_2;

public class ArrEx1p {
	public static void main(String[] args) {
		//int 1차원 배열은 int로 구성된 행렬
		//int 2차원 배열은 int 1차원 배열로 구성된 행렬
		//int 3차원 배열은 int 2차원 배열로 구성된 행렬
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 안에 들어가는 배열 값은 1차원 배열로 나타난 값이다.
		
		System.out.println(arr[1][0]); // 4를 확인하기 위한 장치, 폴더의 개념과 유사 // arr[1][0] 은 int type
		
		String[][][] strs = { // 2번째 차원부터는 배열의 길이가 제각각 이어도 됨. 1번째 차원의 길이만 확정하면 가능
				{}, {{"A", "B", "C"}, {"가", "나", "다"}}, {{"0", "1"}}
				};
		//str. length
		// 0번 인덱스 {}, 1번 인덱스 {{"A", "B", "C"}, {"가", "나", "다"}}, 2번 인덱스 {{"0", "1"}} 길이는 3
		System.out.println(strs); //3차원 배열은 2차원 배열들로 구성되어 있다.
		System.out.println(strs.length); //3차원 배열은 2차원 배열들로 구성되어 있다.
		System.out.println(strs[1]); //strs[1]의 type은 string 2차원 배열 주소값 정도로 보면 된다.
		System.out.println(strs[1].length); // 길이 2
		System.out.println(strs[1][1]); //string 1차원 배열
		System.out.println(strs[1][1].length); //길이 3
		System.out.println(strs[1][1][1]);// 나 로 출력
	}
}
