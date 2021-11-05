package Aca1101;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Addtext extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addtext frame = new Addtext();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Addtext() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Click Here");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == tf1) {
					tf1.setCaretPosition(0); // 커서 위치 처음으로
					tf1.select(0, tf1.getText().length());
					tf1.requestFocus(); // 하이라이트
				}
			}
		});
		btnNewButton.setBounds(12, 33, 97, 23);
		contentPane.add(btnNewButton);
		
		tf1 = new JTextField();
		tf1.setText("\uC0C1\uD488 \uD6C4\uAE30\uB97C \uB0A8\uACA8\uC8FC\uC138\uC694.");
		tf1.setBounds(124, 0, 298, 89);
		contentPane.add(tf1);
		tf1.setColumns(10);
	}
}

// 버튼에 이미지 넣기
// 1) c드라이브, D드라이브 컴폴더에 있는 이미지를 넣으려면 absolute path 선택.
// design 왼쪽 속성창에서 아이콘 - ... - absolute path... - browse -- 이미지 선택 
// - 속성창 text에는 "이미지"라는 글자 입력 - 버튼 크기를 적당히 조절하면 이미지와 글씨가 잘 들어가 있는 것을 알 수 있음.
