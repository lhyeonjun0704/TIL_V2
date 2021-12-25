package EchoServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		
		Socket s = new Socket("127.0.01", 7112);
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		while(true){
			System.out.println("글자 넣어봐");
			String bada1forServer = sc1.nextLine();
			if(bada1forServer.length() == 0) break;
			bw1.write(bada1forServer, 0, bada1forServer.length()); // 서버로 보냄.
			bw1.newLine(); // 줄바꿈도 같이 보내야됨.
			bw1.flush(); // 무조건 서버로 전송한 후 buffer를 비운다.
			String bada2fromServer = br1.readLine(); // server롭 투터 받는다.
			
			System.out.println("서버로부터 다시 옴" + bada2fromServer);
		}
		s.close();
	}

}
