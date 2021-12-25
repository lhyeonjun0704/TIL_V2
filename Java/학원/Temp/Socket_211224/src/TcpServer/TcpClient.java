package TcpServer;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


// Dos모드 사용법
// .java 를 저장하면 컴파일되어 bin 폴더에 class생김 일단 window-show view 에서 navigator를 열어 확인가능
// 필요시 환경변수 path에 java.exe이 있는지 확인
// 내pcp에서 .class가 있는 소스방(bin방) 찾아가되 소스폴더 바로 위까지 간다
// shift 마오하여 "여기서 명령창열기" or "..power shell.." 을 눌러 dos모드로
// 가동방법 - 만일 TcpMS.java 일 경우 java 패키지명.TcpMC127.0.01 2233

public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
//		Socket s1 = new Socket("127.0.0.1", 7780);
//		
//		DataInputStream dis1 = new DataInputStream(s1.getInputStream());
//		System.out.println("니 말대로"  + dis1.readUTF());
//		System.out.println(dis1.readUTF() + " 그래 그렇겧자ㅏ");
//		dis1.close();
//		s1.close();
//		System.out.println("종료");
		
		if(args.length != 2) {
			System.out.println("사용법은 java 파일명 ip주소 포트번호");
			System.exit(1);
		}
		
		Socket s1 = new Socket(args[0], Integer.parseInt(args[1])); // connect 작업
		
		//여기가 send /rcv 위치
		// 서버에 클래스 3개 중 ThreadSend, ThreadRcv 클래스를 클라이언트가 공유하여 사용함
		// 즉, 새로운 클래스 만들 필요 없음
		ThreadSend tsendcli1 = new ThreadSend(s1);
		ThreadRcv trcvcli1 = new ThreadRcv(s1);
		
		tsendcli1.start();
		trcvcli1.start();
		
	}

}
