package TcpServerFile;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpServerFileClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s1 = new Socket("127.0.0.1", 37787);
		//=========================================
		
		DataInputStream dis1 = new DataInputStream(s1.getInputStream());
		
		int len1 = dis1.readInt(); // 서버가 보낸 파일 길이 먼저 받아옴.
		byte[] byteBae2 = new byte[len1]; // 그만큼 바이트 배열 생성
		dis1.readFully(byteBae2); // 그리고 내용 받아 바이트배열로
		
		FileOutputStream fos1 = new FileOutputStream("C:\\Users\\ih919\\Desktop\\학원");
		fos1.write(byteBae2); // 받은 바이트배열 --> 파일로
		
		//==============================================================================
		System.out.println("end");
		
	}

}
