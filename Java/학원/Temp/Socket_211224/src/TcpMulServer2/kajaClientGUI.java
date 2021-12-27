package TcpMulServer2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class kajaClientGUI extends JFrame implements Runnable, ActionListener{
	DataOutputStream outputStream;
	DataInputStream inputStream;
	String nickname;
	
	JLabel jlabel1 = new JLabel("우리반 채팅");
	JTextArea jtarea1 = new JTextArea();
	JTextField jtfield1 = new JTextField();
	JScrollPane jScrollPane = new JScrollPane(jtarea1);
	
	public kajaClientGUI(DataOutputStream outputStream, DataInputStream inputStream, String nickname) {
		this.outputStream = outputStream;
		this.inputStream = inputStream;
		this.nickname = nickname;
		setLayout(new BorderLayout());
		
		jlabel1.setFont(new Font("굴림", Font.BOLD, 22));
		add("North", jlabel1);
		
		jtarea1.setBackground(Color.yellow);
		jtarea1.setForeground(Color.blue);
		jtarea1.setFont(new Font("굴림", Font.BOLD, 22));
		
		jtarea1.setEditable(false);
		add("Center", jScrollPane);
		
		//chat 입력
		jtfield1.setBackground(Color.white);
		jtfield1.setForeground(Color.BLACK);
		jtfield1.setFont(new Font("굴림", Font.BOLD, 25));
		jtfield1.addActionListener(this);
		
		setSize(800, 800);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				
				setVisible(false);
			}
		});
		//===================================================
		// 서버에서 받아 textarea에 뿌려주는 쓰레드
		Thread th1 = new Thread(this);
		th1.start();
		//===================================================
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jtfield1) {
			try {
				outputStream.writeUTF(nickname + " --> " + jtfield1.getText());
			} catch(IOException ee) {
				
			}
			jtfield1.setText("");
		}
	}
	
	Toolkit tk1 = Toolkit.getDefaultToolkit();
	public void run() {
		try {
			while(true) {
				String strServer1 = inputStream.readUTF();
				if(strServer1 == null) {
					jtarea1.append("\n" + "종료");
					return;
				}
				jtarea1.append("\n" + strServer1); // 서버에서 온 것 textarea에 추가
				//------------------------------------------이것 해야 스클로바가 생긴후 마지막 내용 보임
				int kkeut = jtarea1.getText().length();
				jtarea1.setCaretPosition(kkeut); // 커서를 맨 뒤로
				// jtarea1.setCaretpOSITION(0); //커서 처음으로
				tk1.beep(); // chat이 올 때마다 beep음 
			}
		} catch (Exception eee) {
			jtarea1.append("\n" + eee);
		}
	}
	
}






