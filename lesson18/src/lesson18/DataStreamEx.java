package lesson18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {
	public static void main(String[] args) throws Exception {
//		System.out.println(Math.PI);// 숫자로 하나 하나 저장하면 17바이트가 된다. (double type) 
//		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
		
//		dos.writeDouble(Math.PI); 
		dos.writeChar('A');
		dos.writeChar('B');
		dos.writeChar('C');
		dos.writeChar('D');
		dos.writeLong(10);
		
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
		long l = dis.readLong();
		
		System.out.println(l);
		System.out.println(Long.toHexString(l));
//		System.out.println(dis.readShort());
//		System.out.println(dis.readShort());
//		System.out.println(dis.readShort());
//		System.out.println(dis.readShort());
		System.out.println(dis.readByte());
		System.out.println(dis.readByte());
		System.out.println(dis.readByte());
		System.out.println(dis.readByte());
		System.out.println(dis.readByte());
		System.out.println(dis.readByte());
		System.out.println(dis.readByte());
		System.out.println(dis.readByte());
//		System.out.println(dis.readInt());
		dis.close(); 
		
		
		
		// 해석 가능한 수로 가보자.
	}
}
