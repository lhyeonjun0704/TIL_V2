package EchoServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket ss1 = new ServerSocket(7112); //listen
		
		Socket s1 = ss1.accept();
		
		InputStream is1 = s1.getInputStream(); // ���Ͽ��� �Է½�Ʈ�� ����
		
		OutputStream os1 = s1.getOutputStream();
		
		int b1;
		while(true) {
			b1 = is1.read();
			if(b1 == -1) break;
			os1.write(b1);
		}
		
	}

}

// ������ ���� -> Ŭ���̾�Ʈ
// ��Ŭ������ �ϴ� ���, ������� ���