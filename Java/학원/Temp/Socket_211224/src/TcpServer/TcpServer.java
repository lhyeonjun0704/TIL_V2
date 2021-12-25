package TcpServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class ThreadSend extends Thread{
	Socket s1;
	DataOutputStream dos1; // out -> "��ȭ" ���� ��
	// �⺻������Ÿ�Ԥ����� ó���ϱ� ����) writeInt, writeUTF(���ڿ�ó��)
	String what1;
	
	ThreadSend(Socket s1) throws IOException{
		this.s1 = s1;
		dos1 = new DataOutputStream(s1.getOutputStream());
		what1 = "������==>";
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
	// what1 = "������ ==>" ----------> ���������� ó���ϹǷ� �Ⱦ�
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
//		System.out.println("�غ���");
//		
//		while(true) {
//			System.out.println("��ٸ��� ��");
//			Socket s1 = ss1.accept();
//			System.out.println(s1.getInetAddress() + "���� ��");
//			
//			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
//			dos1.writeUTF("������!");
//			
//			dos1.close();
//			s1.close();
//		}
		
		if(args.length != 1) { // ��Ʈ��ȣ�� �ȵ�����
			System.out.println("������ java ���ϸ� ��Ʈ��ȣ");
			System.exit(1);
		}
		
		// ����� ���� �ʿ� commandline argument
		ServerSocket ss1 = new ServerSocket(Integer.parseInt(args[0]));
		System.out.println("���� �غ� ��");
		
		while(true) {
			System.out.println("��ȭ ��𸮴� ��");
			Socket s1 = ss1.accept();
			
			// �Ʒ��� ���� receive /send�� �����ڸ�
			// ���⼭ thread ���
			ThreadSend tsendSer1 = new ThreadSend(s1);
			ThreadRcv trcvSer1 = new ThreadRcv(s1);
			tsendSer1.start();
			trcvSer1.start();
		}
		
	}

}
