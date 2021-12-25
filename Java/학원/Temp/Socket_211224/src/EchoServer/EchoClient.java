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
			System.out.println("���� �־��");
			String bada1forServer = sc1.nextLine();
			if(bada1forServer.length() == 0) break;
			bw1.write(bada1forServer, 0, bada1forServer.length()); // ������ ����.
			bw1.newLine(); // �ٹٲ޵� ���� �����ߵ�.
			bw1.flush(); // ������ ������ ������ �� buffer�� ����.
			String bada2fromServer = br1.readLine(); // server�� ���� �޴´�.
			
			System.out.println("�����κ��� �ٽ� ��" + bada2fromServer);
		}
		s.close();
	}

}
