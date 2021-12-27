package TcpMulServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class ThreadClientSendClass implements Runnable{
	Socket socket;
	DataOutputStream outputStream;
	String nickname;
	
	public ThreadClientSendClass(Socket socket, String nickname) throws IOException {
		this.socket = socket;
		outputStream = new DataOutputStream(socket.getOutputStream());
		this.nickname = nickname;
	}

	@Override
	public void run() {
		Scanner in1 = new Scanner(System.in);
		try {
			if(outputStream != null) {
				outputStream.writeUTF(nickname);
			}
			while(outputStream != null) {
				outputStream.writeUTF("(**" + nickname + "**)" + in1.nextLine());
				
			}
		} catch(IOException e) {
			
		}
		
	}
	
	
}

class ThreadClientRcvClass implements Runnable{
	Socket socket;
	DataInputStream inputStream;
	
	public ThreadClientRcvClass(Socket socket) throws IOException {
		this.socket = socket;
		inputStream = new DataInputStream(socket.getInputStream());
	}

	@Override
	public void run() {
		while(inputStream != null) {
			try {
				System.out.println(inputStream.readUTF());
			} catch(IOException e) {
//				e.printStackTrace();
			}
		}
	}
}

public class TcpMulClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3) {
			System.out.println("사용법 : ~");
			System.exit(1);
		}
		try {
			Socket s1 = new Socket(args[0], Integer.parseInt(args[1]));
			System.out.println("서버에 연결...");
			//======console(dos)========================================
			ThreadClientSendClass tcc1 = new ThreadClientSendClass(s1, args[2]);
			ThreadClientRcvClass tcr1 = new ThreadClientRcvClass(s1);
			
			Thread tsend1 = new Thread(tcc1);
			Thread trcv1 = new Thread(tcr1);
			tsend1.start();
			trcv1.start();
			
		} catch(Exception e) {
//			e.printStackTrace();
		}
	}

}
