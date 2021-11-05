package Aca1101;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Imgbutton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imgbutton frame = new Imgbutton();
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
	public Imgbutton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ih919\\Downloads\\1.png"));
		btnNewButton.setBounds(12, 10, 282, 235);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon(Imgbutton.class.getResource("/Img/1.png")));
		btnNewButton_1.setBounds(12, 278, 335, 143);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(333, 10, 422, 70);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}

// 만일 이클립스 src 아래에 만든 images 패키지방에서 이미지를 가지고와 넣으면 아이콘 - classpath resource 선택

// JTextarea에 스크롤바 만들기
// JScrollpane 위로 올리고 그 위에 JTextarea 바로 올리면 viewport개념으로 크기가 일치한다.
// scrollPane.setViewportView(textArea); 실행 시에는 JTextarea에 글자를 계속넣어보고 한 줄 길게 넣어보면 스크롤바가 both(가로, 세로)로 생긴다.