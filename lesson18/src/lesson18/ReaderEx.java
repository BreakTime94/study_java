package lesson18;

import java.io.FileReader;
import java.util.Arrays;

public class ReaderEx {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("file.txt"); //한 글자로 인식 즉, 문자 기반 read
//		int c = 0 ;
//		int count = 0;
//		System.out.println(c);
//		
//		while((c = fr.read()) != -1) {
//			System.out.println(c + " :: " + (char)c);
//			count++;
//		}
//		System.out.println(count + "글자 읽음");
		
		char[] chs = new char[10];
		int ret = fr.read(chs);
		System.out.println(Arrays.toString(chs));
		System.out.println(ret);
		
		ret = fr.read(chs);
		System.out.println(Arrays.toString(chs)); //뒤의 가나다라가 나오고 그 이후는 기존 저장된 배열 내 인덱스 참조값이 그대로 나타남
		System.out.println(ret);
		fr.close(); //space는 32의 숫자로 뜸 여기서는 문자기반 read();는 13과 10 둘다 개행 한번으로 처리한다.
	}
}
