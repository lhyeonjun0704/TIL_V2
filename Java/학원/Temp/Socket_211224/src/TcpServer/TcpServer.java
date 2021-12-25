package TcpServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class ThreadSend extends Thread{
	Socket s1;
	DataOutputStream dos1; // out -> "대화" 보낼 것
	// 기본데이터타입ㅂ려로 처리하기 ㅇㅖ) writeInt, writeUTF(문자열처리)
	String what1;
	
	ThreadSend(Socket s1) throws IOException{
		this.s1 = s1;
		dos1 = new DataOutputStream(s1.getOutputStream());
		what1 = "미팅중==>";
	}
	
	public void run() {
		Scanner sc1 = new Scanner(System.in);
		while(dos1 != null) {
			try {
				dos1. writeUTF(what1 + sc1.nextLine());
			} catch(IOException e){
				
			}
		}
	}
}

class ThreadRcv extends Thread{
	Socket s1;
	DataInputStream dis1;
	// what1 = "미팅중 ==>" ----------> 보내는쪽이 처리하므로 안씀
	ThreadRcv(Socket s1) throws IOException{
		this.s1 = s1; 
		dis1 = new DataInputStream(s1.getInputStream()); // network input stream(read)
	}
	public void run() {
		while(dis1 != null) {
			try {
				System.out.println(dis1.readUTF());
			} catch(IOException e) {
				
			}
		}
	}
}

public class TcpServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		ServerSocket ss1 = new ServerSocket(7780);
//		System.out.println("준비중");
//		
//		while(true) {
//			System.out.println("기다리는 중");
//			Socket s1 = ss1.accept();
//			System.out.println(s1.getInetAddress() + "에서 옴");
//			
//			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
//			dos1.writeUTF("오랜만!");
//			
//			dos1.close();
//			s1.close();
//		}
		
		if(args.length != 1) { // 포트번호가 안들어오면
			System.out.println("사용법은 java 파일명 포트번호");
			System.exit(1);
		}
		
		// 명령행 인자 필요 commandline argument
		ServerSocket ss1 = new ServerSocket(Integer.parseInt(args[0]));
		System.out.println("서버 준비 됨");
		
		while(true) {
			System.out.println("대화 기디리는 중");
			Socket s1 = ss1.accept();
			
			// 아래는 원래 receive /send가 오는자리
			// 여기서 thread 사용
			ThreadSend tsendSer1 = new ThreadSend(s1);
			ThreadRcv trcvSer1 = new ThreadRcv(s1);
			tsendSer1.start();
			trcvSer1.start();
		}
		
	}

}
