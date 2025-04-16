package lesson05;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownloader { // 인터넷에 이미지를 다운로드 받는 법!

	public static void main(String[] args) throws Exception {
	
		String img = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAzMTFfMjQy%2FMDAxNzQxNjg1NDYxNTUx.v4tN2D0b5ylmNdDzRWwhSBDorD3odSA09JR3YYAd2V0g.4WTFwJdys3M-L1TkqEXOkprtChBuiXcy0UWMZGTAWUUg.PNG%2F%25B0%25ED%25BE%25E7%25C0%25CC%25C5%25B8%25BF%25EC%25B8%25B07.png&type=sc960_832";

		URL url = new URL(img); //URL 자동 완성 해야함. (ctrl + space)
	
		InputStream is = url.openStream();
		
		FileOutputStream fos = new FileOutputStream("고양이.png");
		
		int b = 0;
		
		while  ( (b = is.read()) != -1)  {
			
			fos.write(b);
			
		}
		fos.close();
	}
}
