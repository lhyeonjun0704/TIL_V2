package TcpServerFile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss1 = new ServerSocket(37787);
		System.out.println("서버 준비");
		
		while(true) {
			System.out.println("기다리는 중");
			Socket s1 = ss1.accept();
			System.out.println(s1.getInetAddress() + "에서 접속");
			//------------------------------
			
			File file1 = new File("C:/Users/ih919/Desktop/학원/1.txt");
			
			FileInputStream fis1 = new FileInputStream(file1);
			DataInputStream dis1 = new DataInputStream(fis1);
			
			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
			
			//=================================================================
			byte[] byteBae = new byte[(int) file1.length()];
			
			System.out.println("file -> byte 중");
			dis1.readFully(byteBae); // 파일내용 --> 바이트배열
			
			dos1.writeInt(byteBae.length); // 파일길이 먼저 전송
			dos1.write(byteBae); // 바이트배열 전송
			//------------------------------------------------------------------
			System.out.println("전송 완료");
		}
	}

}
