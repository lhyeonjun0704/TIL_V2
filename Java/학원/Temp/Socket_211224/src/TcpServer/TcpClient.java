package TcpServer;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


// Dos��� ����
// .java �� �����ϸ� �����ϵǾ� bin ������ class���� �ϴ� window-show view ���� navigator�� ���� Ȯ�ΰ���
// �ʿ�� ȯ�溯�� path�� java.exe�� �ִ��� Ȯ��
// ��pcp���� .class�� �ִ� �ҽ���(bin��) ã�ư��� �ҽ����� �ٷ� ������ ����
// shift �����Ͽ� "���⼭ ���â����" or "..power shell.." �� ���� dos����
// ������� - ���� TcpMS.java �� ��� java ��Ű����.TcpMC127.0.01 2233

public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
//		Socket s1 = new Socket("127.0.0.1", 7780);
//		
//		DataInputStream dis1 = new DataInputStream(s1.getInputStream());
//		System.out.println("�� �����"  + dis1.readUTF());
//		System.out.println(dis1.readUTF() + " �׷� �׷����ڤ�");
//		dis1.close();
//		s1.close();
//		System.out.println("����");
		
		if(args.length != 2) {
			System.out.println("������ java ���ϸ� ip�ּ� ��Ʈ��ȣ");
			System.exit(1);
		}
		
		Socket s1 = new Socket(args[0], Integer.parseInt(args[1])); // connect �۾�
		
		//���Ⱑ send /rcv ��ġ
		// ������ Ŭ���� 3�� �� ThreadSend, ThreadRcv Ŭ������ Ŭ���̾�Ʈ�� �����Ͽ� �����
		// ��, ���ο� Ŭ���� ���� �ʿ� ����
		ThreadSend tsendcli1 = new ThreadSend(s1);
		ThreadRcv trcvcli1 = new ThreadRcv(s1);
		
		tsendcli1.start();
		trcvcli1.start();
		
	}

}
