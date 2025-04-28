package lesson18;

import java.io.FileInputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("file.txt");
//		int b = fis.read();
//		System.out.println(b); //49는 문자(아스키 코드 내 숫자 1을 뜻함) 즉 file 내 1을 아스키코드 49로 나타내는 것임
//		b = fis.read();
//		System.out.println(b);
		
//		for(int i = 0; i < 24; i++) {
//			int b = fis.read();
//			System.out.println(b + " :: " + (char)b);
//		}
//		System.out.println(fis.read()); // 한 번 더 읽으면 -1이 나오고 이는 읽을 것이 없다는 뜻이다.
		
		// UTF-8 영문, 숫자, 특수문자는 1byte
		// 한글은 3byte, 엔터는 \r\n의 조합으로 2byte로 처리
		// UTF-16 모든글자 2byte ms949는 영문, 숫자, 특수문자는 1byte 한글은 2byte 사용함
		
		//EOF (End Of File)에 도달시 -1이 나옴 즉 -1이 나오기전까지로 처리하면 된다.
//		int b = 0;
//		while((b = fis.read()) != -1) {
//			System.out.println(b + " :: " + (char)b);
//		}
		//배열에 관한 것
//		byte[] bs = new byte[50];
//		
//		int ret = fis.read(bs); // 횟수가 넘어가면 이전 배열 값이 그대로 나온다.
//		System.out.println(Arrays.toString(bs)); // -값이 나온 이유는 byte가 -128 ~ 127까지만 담을 수 있기에, 2의 보수형태로 처리
//		System.out.println(ret);
		
		byte[] bs = new byte[50];
		
		int ret = fis.read(bs, 5, 10); //5는 배열의 시작위치, 10은 읽어올 갯수 , read 할 때는 잘 사용하지 않지만, write 할 때는 좀 쓴다.
		System.out.println(Arrays.toString(bs));
		System.out.println(ret);
		
		byte[] bs2 = fis.readAllBytes(); // 읽을 문서의 byte 만큼 배열의 크기가 잘림, 다만 너무 큰 파일을 읽으면 더 느려짐
		
		System.out.println(Arrays.toString(bs2));
		
		fis.close();
		
		
		
	}
}
