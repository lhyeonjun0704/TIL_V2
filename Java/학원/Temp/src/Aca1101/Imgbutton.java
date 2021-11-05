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

// ���� ��Ŭ���� src �Ʒ��� ���� images ��Ű���濡�� �̹����� ������� ������ ������ - classpath resource ����

// JTextarea�� ��ũ�ѹ� �����
// JScrollpane ���� �ø��� �� ���� JTextarea �ٷ� �ø��� viewport�������� ũ�Ⱑ ��ġ�Ѵ�.
// scrollPane.setViewportView(textArea); ���� �ÿ��� JTextarea�� ���ڸ� ��ӳ־�� �� �� ��� �־�� ��ũ�ѹٰ� both(����, ����)�� �����.