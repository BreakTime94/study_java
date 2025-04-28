package lesson18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BrEx {
	public static void main(String[] args) throws Exception {
		//특정 파일을 문자기반 스트림입력
		
		FileReader fr = new FileReader("output.txt2");
		//버퍼 기반의 보조 스트림 사용 보조 스트림을 통해 메인스트림 호출
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str = br.readLine()) != null) {
			System.out.println(str);	
		}
		
//		System.out.println(str);
//		
//		str = br.readLine();
//		System.out.println(str);
//		
//		str = br.readLine();
//		System.out.println(str);
//		
//	
//		str = br.readLine(); //참조형일때는 그 이상이 넘어가면 null로 반환
//		System.out.println(str);
		
		br.close();
		
		// 문자 <> 바이트 
		FileInputStream fis = new FileInputStream("output.txt2");
		InputStreamReader isr = new InputStreamReader(fis);// 보조스트림 중에 1개 외부에서부터 바이트를 입력 받았을 때 자바 내에서 문자기반으로 바뀜
		//isr 객체는 Reader 타입임
		BufferedReader br2 = new BufferedReader(isr); // byte type -> readerttype -> buffer로 감싸기
		
		
		
		OutputStreamWriter osw; // 출력시 문자가 바이트로 변환
		
		
		
		
	}
}
