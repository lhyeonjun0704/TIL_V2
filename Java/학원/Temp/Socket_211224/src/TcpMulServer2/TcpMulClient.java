package TcpMulServer2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
			DataOutputStream outputStream = new DataOutputStream(s1.getOutputStream());
			DataInputStream inputStream = new DataInputStream(s1.getInputStream());
			outputStream.writeUTF("##" + args[2]);
			
			new kajaClientGUI(outputStream, inputStream, args[2]) {
				public void closeWork() throws IOException {
					outputStream.close();
					inputStream.close();
					System.exit(0);;
				}
			};
			
		} catch(Exception e) {
//			e.printStackTrace();
		}
	}

}
