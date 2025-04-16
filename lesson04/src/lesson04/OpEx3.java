package lesson04;

public class OpEx3 {

	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		++a;
		b++;
		
		System.out.println(++a); //12 출력
		System.out.println(b++); //11 출력 println 값을 출력하는데 일단 b가 필요하므로 먼저 출력하고, 그 다음 b 값을 증가 시킴
		
	}
}
