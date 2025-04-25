package lesson17;

import java.io.IOException;

public class ProcessEx {
	public static void main(String[] args) throws Exception {
		Process p1 = Runtime.getRuntime().exec("notepad.exe");
		Process p2 = Runtime.getRuntime().exec("mspaint.exe");
		
		p1.waitFor(); //p1 process가 종료될때까지 대기한다. 
		p2.destroy(); // p1 process가 종료되면 알아서 바로 종료된다.
	}
}
