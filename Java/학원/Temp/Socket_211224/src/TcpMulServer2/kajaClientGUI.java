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
	
	JLabel jlabel1 = new JLabel("�츮�� ä��");
	JTextArea jtarea1 = new JTextArea();
	JTextField jtfield1 = new JTextField();
	JScrollPane jScrollPane = new JScrollPane(jtarea1);
	
	public kajaClientGUI(DataOutputStream outputStream, DataInputStream inputStream, String nickname) {
		this.outputStream = outputStream;
		this.inputStream = inputStream;
		this.nickname = nickname;
		setLayout(new BorderLayout());
		
		jlabel1.setFont(new Font("����", Font.BOLD, 22));
		add("North", jlabel1);
		
		jtarea1.setBackground(Color.yellow);
		jtarea1.setForeground(Color.blue);
		jtarea1.setFont(new Font("����", Font.BOLD, 22));
		
		jtarea1.setEditable(false);
		add("Center", jScrollPane);
		
		//chat �Է�
		jtfield1.setBackground(Color.white);
		jtfield1.setForeground(Color.BLACK);
		jtfield1.setFont(new Font("����", Font.BOLD, 25));
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
		// �������� �޾� textarea�� �ѷ��ִ� ������
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
					jtarea1.append("\n" + "����");
					return;
				}
				jtarea1.append("\n" + strServer1); // �������� �� �� textarea�� �߰�
				//------------------------------------------�̰� �ؾ� ��Ŭ�ιٰ� ������ ������ ���� ����
				int kkeut = jtarea1.getText().length();
				jtarea1.setCaretPosition(kkeut); // Ŀ���� �� �ڷ�
				// jtarea1.setCaretpOSITION(0); //Ŀ�� ó������
				tk1.beep(); // chat�� �� ������ beep�� 
			}
		} catch (Exception eee) {
			jtarea1.append("\n" + eee);
		}
	}
	
}






