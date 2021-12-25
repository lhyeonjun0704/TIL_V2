package DataInOutStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos1 = new FileOutputStream("C:/Users/ih919/Desktop/data1.txt");
		DataOutputStream dos1 = new DataOutputStream(fos1);
		
		// int, char 형 등의 기본 자료형을 Byte 스트림으로 입출력가능
		dos1.writeInt(35); // 파일에서 4바이트 확보하여 10진수 35를 파일에 2진으로 넣고
		
		dos1.writeDouble(Double.MAX_VALUE); // 8바이트로 잡히고
		dos1.writeByte(Byte.MIN_VALUE);
		dos1.writeChar('학'); // utf이기 떄문에 2바이트로 잡힐 것이다.
		dos1.writeBoolean(false);
		
		dos1.writeUTF("라뗴 is horse");
		dos1.close();
		fos1.close();
		
		FileInputStream fis1 = new FileInputStream("C:/Users/ih919/Desktop/data1.txt");
		DataInputStream dis1 = new DataInputStream(fis1);
		
		System.out.println(dis1.readInt() + "\t" + dis1.readDouble());
		System.out.println(dis1.readByte() + "\t" + dis1.readChar());
		System.out.println(dis1.readBoolean() + "\t" + dis1.readUTF());
		dis1.close(); fis1.close();
		
	}

}
