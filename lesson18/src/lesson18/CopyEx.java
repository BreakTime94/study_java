package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class CopyEx {
	public static void main(String[] args) throws Exception {
		//output2.txt 파일을 output3.txt 파일로 복사
		//파일 인풋 스트림, 파일 아웃풋스트림 2개 다 써야함.
		FileInputStream fis = new FileInputStream("output.txt2");
		FileOutputStream fos = new FileOutputStream("output3.txt");
		//읽은만큼 다 써라
//		byte[] arr = fis.readAllBytes(); // 파일의 크기가 크면 엄청 느려지기 때문에 버퍼 추천
//		System.out.println(Arrays.toString(arr));
//		fos.write(arr);
		
		//1byte씩 읽는 법
//		int b = 0;
//		while ((b = fis.read()) != -1) {
//			fos.write(b);
//		}
		//byte buf 쓰는 법
		
		byte[] bs = new byte[10];
		int length = 0;
		
		while((length = fis.read(bs)) != -1) {
			fos.write(bs, 0, length);
		}
		
		fis.close();
		fos.close();
		
		
	}
}
