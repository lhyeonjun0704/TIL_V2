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
		
		int len1 = dis1.readInt(); // ������ ���� ���� ���� ���� �޾ƿ�.
		byte[] byteBae2 = new byte[len1]; // �׸�ŭ ����Ʈ �迭 ����
		dis1.readFully(byteBae2); // �׸��� ���� �޾� ����Ʈ�迭��
		
		FileOutputStream fos1 = new FileOutputStream("C:\\Users\\ih919\\Desktop\\�п�");
		fos1.write(byteBae2); // ���� ����Ʈ�迭 --> ���Ϸ�
		
		//==============================================================================
		System.out.println("end");
		
	}

}
