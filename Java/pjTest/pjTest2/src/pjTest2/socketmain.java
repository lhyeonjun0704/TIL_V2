package pjTest2;

import java.net.ServerSocket;
import java.net.Socket;

public class socketmain {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ �غ� �Ϸ�");
			
			socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
			System.out.println("socket : " + socket);
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
				
			} catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
}
