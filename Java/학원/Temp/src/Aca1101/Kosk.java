package Aca1101;

// Jlist

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Kosk extends JFrame {

	private JPanel contentPane;
	
	String msg = "";
	int sum = 0;
	String msg2 = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kosk frame = new Kosk();
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
	public Kosk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uBD88\uACE0\uAE30\uBC84\uAC70 : 3000");
		btnNewButton.addMouseListener(new MouseAdapter() { // mouseadapter
			@Override
			public void mouseClicked(MouseEvent e) {
				msg += "ºÒ°í±â ¹ö°Å : 3000 \n";
				sum += 3000;
			}
		});
		btnNewButton.setBackground(new Color(0, 204, 204));
		btnNewButton.setBounds(42, 147, 252, 96);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBE45\uB9E5 : 5000");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				msg += "ºò¸Æ : 3000 \n";
				sum += 5000;
			}
		});
		btnNewButton_1.setBounds(363, 147, 267, 96);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("** \uD584\uBC84\uAC70 **");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 16));
		lblNewLabel.setBounds(40, 56, 254, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBA54\uB274\uB97C \uC120\uD0DD\uD574\uC8FC\uC138\uC694.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 16));
		lblNewLabel_1.setBounds(346, 52, 278, 41);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("\uC0C8\uC6B0\uBC84\uAC70 : 4000");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				msg += "»õ¿ì ¹ö°Å : 4000 \n";
				sum += 4000;
			}
		});
		btnNewButton_2.setBounds(42, 273, 252, 96);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uCE58\uD0A8\uBC84\uAC70 : 3000");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				msg += "Ä¡Å² ¹ö°Å : 3000 \n";
				sum += 3000;
			}
		});
		btnNewButton_3.setBounds(363, 273, 267, 96);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uC8FC\uBB38\uD558\uAE30");
		btnNewButton_4.setBounds(42, 419, 252, 89);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\uCDE8\uC18C");
		btnNewButton_5.setBounds(363, 419, 267, 96);
		contentPane.add(btnNewButton_5);
		
		JList list = new JList();
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"\uC885\uB85C", "\uC885\uB85C \uC678"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(42, 539, 201, 75);
		contentPane.add(list);
	}
}

