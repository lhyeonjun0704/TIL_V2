package TcpServerIMG;

import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;

public class TcpServerIMG {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss1 = new ServerSocket(57789);
		System.out.println("서버 준비");
		
		while(true) {
			System.out.println("기다리는 중");
			Socket s1 = ss1.accept();
			System.out.println(s1.getInetAddress() + "에서 접속");
			// --------------------------------------------------
			File file1 = new File("C:/Users/ih919/Desktop/코딩/test.jpg");
			
			FileInputStream fis1 = new FileInputStream(file1);
			DataInputStream dis1 = new DataInputStream(fis1);
			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
			
			BufferedImage buffimage1 = ImageIO.read(dis1);
			
			ImageIO.write(buffimage1, "jpg", dos1);
			
			s1.close();
			System.out.println("전송 완료");
		}
		
	}

}
