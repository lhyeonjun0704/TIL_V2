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
	
	// 생성자를 만나게 해야 port번호를 같은 초기치 처리
	public ServerClass(int portno) throws IOException {
		Socket s1 = null;
		ServerSocket ss1 = new ServerSocket(portno);
		System.out.println("서버 가동...");
		while(true) {
			s1 = ss1.accept();
			System.out.println("접속주소 : " + s1.getInetAddress() + ", 접속포트 : " + s1.getPort());
			ThreadServerClass tServer1 = new ThreadServerClass(s1); // s1초기치
			tServer1.start();
			threadList.add(tServer1);
			
			System.out.println("접속자 수 : " + threadList.size() + " 명");
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
					sendChat(nickname + "님 입장");
					// 클라이언트로 처음 보내는 것은 별명, 전체회원에게 지금들어온 사람의 별명을 보내기위한 작업
				}
				while( inputStream != null) {
					// System.out.println(inputStream.readUTF());
					sendChat(inputStream.readUTF());
					// 이번에는 별명이 아니라 클라이언트가 보낸 채팅 내용 접속한 모두에게 보냄
				}
			} catch(IOException e) {
				// e.printStackTrace(); //에러내용
			} finally { // 
				// 나간 쓰레드의 인덱스 찾기
				for(int i = 0; i < threadList.size(); i++) {
					if(socket1.equals(threadList.get(i).socket1)) {
						threadList.remove(i);
						try {
							sendChat(nickname + "님 퇴장");
						} catch(IOException e){
							//e.printStackTrace();
						}
					}
				}
				System.out.println("접속자 수 : " + threadList.size() + " 명");
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
			System.out.println("사용법 : 서버실행은 \'java 패키지명.파일명 포트번호 \' 형식으로 입력");
		}
		new ServerClass(Integer.parseInt(args[0]));
	}

}
