package TcpServerIMG;

import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.imageio.ImageIO;

public class TcpClientIMG {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s1 = new Socket("127.0.0.1", 57789);
		
		FileOutputStream fos1 = new FileOutputStream("C:/Users/ih919/Desktop/코딩/test.jpg");
		
		DataInputStream dis1 = new DataInputStream(s1.getInputStream());
		
		BufferedImage buffimage1 = ImageIO.read(dis1);
		
		ImageIO.write(buffimage1, "jpg", fos1);
		System.out.println("jpg로 저장됨");
		
		s1.close();
		System.out.println("end");
		
	}

}
