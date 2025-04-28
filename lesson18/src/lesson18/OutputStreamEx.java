package lesson18;

import java.io.FileOutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("output.txt2"); //true를 쓰면 이어쓰기, 그게 아니면 덮어쓰기
		
//		fos.write('A');
//		fos.write('B');
//		fos.write('C');
//		
//		byte[] bs = {' ', 48, 49, 50, 51};
//		fos.write(bs);
//		
//		fos.write(13);
//		fos.write(10);
//		fos.write(97);
//		fos.write(98);
//		fos.write(99);
		
		//A-Z, a-z, 0~9 개행은 /n만 사용
		
		
		for(int i = 'A'; i <= 'Z'; i++) {
			fos.write(i);
		}
		fos.write(10);
		for(int i = 'a'; i <= 'z'; i++) {
			fos.write(i);
		}
		fos.write(10);
		for(int i = '0'; i <= '9'; i++) {
			fos.write(i);
		}
		
		
		
		
		fos.close();
	}
}
