package TcpMulServer2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass{
	ArrayList<ThreadServerClass> threadList = new ArrayList<ThreadServerClass>();
	Socket socket;
	DataOutputStream outputStream;
	
	// �����ڸ� ������ �ؾ� port��ȣ�� ���� �ʱ�ġ ó��
	public ServerClass(int portno) throws IOException {
		Socket s1 = null;
		ServerSocket ss1 = new ServerSocket(portno);
		System.out.println("���� ����...");
		while(true) {
			s1 = ss1.accept();
			System.out.println("�����ּ� : " + s1.getInetAddress() + ", ������Ʈ : " + s1.getPort());
			ThreadServerClass tServer1 = new ThreadServerClass(s1); // s1�ʱ�ġ
			tServer1.start();
			threadList.add(tServer1);
			
			System.out.println("������ �� : " + threadList.size() + " ��");
		}
	}
	
	class ThreadServerClass extends Thread{
		Socket socket1;
		DataInputStream inputStream;
		DataOutputStream outputStream;
		
		public ThreadServerClass(Socket s1) throws IOException {
			socket1 = s1;
			inputStream = new DataInputStream(s1.getInputStream());
			outputStream = new DataOutputStream(s1.getOutputStream());
		}
		
		@Override
		public void run() {
			String nickname = "";
			try {
				if(inputStream != null) {
					nickname = inputStream.readUTF();
					sendChat(nickname + "�� ����");
					// Ŭ���̾�Ʈ�� ó�� ������ ���� ����, ��üȸ������ ���ݵ��� ����� ������ ���������� �۾�
				}
				while( inputStream != null) {
					// System.out.println(inputStream.readUTF());
					sendChat(inputStream.readUTF());
					// �̹����� ������ �ƴ϶� Ŭ���̾�Ʈ�� ���� ä�� ���� ������ ��ο��� ����
				}
			} catch(IOException e) {
				// e.printStackTrace(); //��������
			} finally { // 
				// ���� �������� �ε��� ã��
				for(int i = 0; i < threadList.size(); i++) {
					if(socket1.equals(threadList.get(i).socket1)) {
						threadList.remove(i);
						try {
							sendChat(nickname + "�� ����");
						} catch(IOException e){
							//e.printStackTrace();
						}
					}
				}
				System.out.println("������ �� : " + threadList.size() + " ��");
			}
		}
		
	}
	public void sendChat(String chat) throws IOException {
		for(int i = 0; i < threadList.size(); i++) {
			threadList.get(i).outputStream.writeUTF(chat);
		}
	}
	
}

public class TcpMulServer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("���� : ���������� \'java ��Ű����.���ϸ� ��Ʈ��ȣ \' �������� �Է�");
		}
		new ServerClass(Integer.parseInt(args[0]));
	}

}
