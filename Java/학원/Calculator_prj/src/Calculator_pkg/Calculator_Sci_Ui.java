package Calculator_pkg;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calculator_Sci_Ui extends JFrame {

	private JPanel contentPane;
	private JTextField PPrint;
	private ArrayList num;
	private ArrayList op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_Std_Ui frame = new Calculator_Std_Ui();
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
	public Calculator_Sci_Ui() {
		setTitle("\uACF5\uD559 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChange = new JButton("\uBCC0\uD658");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnChange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Calculator_Std_Ui().setVisible(true);
			}
		});
		btnChange.setBounds(115, 117, 215, 74);
		contentPane.add(btnChange);
		
		PPrint = new JTextField();
		PPrint.setBounds(5, 37, 439, 63);
		contentPane.add(PPrint);
		PPrint.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn0.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn0.setBounds(5, 461, 215, 74);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn1.setBounds(5, 375, 105, 74);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn2.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn2.setBounds(115, 375, 105, 74);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn3.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn3.setBounds(225, 375, 105, 74);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn4.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn4.setBounds(5, 289, 105, 74);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn5.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn5.setBounds(115, 289, 105, 74);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn6.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn6.setBounds(225, 289, 105, 74);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn7.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(5, 203, 105, 74);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn8.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn8.setBounds(115, 203, 105, 74);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn9.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn9.setBounds(225, 203, 105, 74);
		contentPane.add(btn9);
		
		JButton btnEqu = new JButton("=");
		btnEqu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnEqu.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnEqu.setBounds(335, 461, 105, 74);
		contentPane.add(btnEqu);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnPlus.setFont(new Font("±¼¸²", Font.BOLD, 22));
		btnPlus.setBounds(335, 375, 105, 74);
		contentPane.add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnSub.setFont(new Font("±¼¸²", Font.BOLD, 22));
		btnSub.setBounds(335, 289, 105, 74);
		contentPane.add(btnSub);
		
		JButton btnMul = new JButton("x");
		btnMul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMul.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnMul.setBounds(335, 203, 105, 74);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnDiv.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnDiv.setBounds(335, 117, 105, 74);
		contentPane.add(btnDiv);
		
		JButton btnRes = new JButton("C");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PPrint.setText("0");
			}
		});
		btnRes.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnRes.setBounds(5, 117, 105, 74);
		contentPane.add(btnRes);
		
		JButton btnDot = new JButton(".");
		btnDot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnDot.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnDot.setBounds(225, 461, 105, 74);
		contentPane.add(btnDot);
	}
}
