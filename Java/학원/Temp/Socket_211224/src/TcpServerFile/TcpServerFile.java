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
		System.out.println("���� �غ�");
		
		while(true) {
			System.out.println("��ٸ��� ��");
			Socket s1 = ss1.accept();
			System.out.println(s1.getInetAddress() + "���� ����");
			//------------------------------
			
			File file1 = new File("C:/Users/ih919/Desktop/�п�/1.txt");
			
			FileInputStream fis1 = new FileInputStream(file1);
			DataInputStream dis1 = new DataInputStream(fis1);
			
			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
			
			//=================================================================
			byte[] byteBae = new byte[(int) file1.length()];
			
			System.out.println("file -> byte ��");
			dis1.readFully(byteBae); // ���ϳ��� --> ����Ʈ�迭
			
			dos1.writeInt(byteBae.length); // ���ϱ��� ���� ����
			dos1.write(byteBae); // ����Ʈ�迭 ����
			//------------------------------------------------------------------
			System.out.println("���� �Ϸ�");
		}
	}

}
