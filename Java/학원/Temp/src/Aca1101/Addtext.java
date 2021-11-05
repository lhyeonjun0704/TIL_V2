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
					tf1.setCaretPosition(0); // Ŀ�� ��ġ ó������
					tf1.select(0, tf1.getText().length());
					tf1.requestFocus(); // ���̶���Ʈ
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

// ��ư�� �̹��� �ֱ�
// 1) c����̺�, D����̺� �������� �ִ� �̹����� �������� absolute path ����.
// design ���� �Ӽ�â���� ������ - ... - absolute path... - browse -- �̹��� ���� 
// - �Ӽ�â text���� "�̹���"��� ���� �Է� - ��ư ũ�⸦ ������ �����ϸ� �̹����� �۾��� �� �� �ִ� ���� �� �� ����.
