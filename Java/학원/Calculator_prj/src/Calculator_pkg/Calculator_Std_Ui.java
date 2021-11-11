package Calculator_pkg;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class Calculator_Std_Ui extends JFrame {
	private JPanel contentPane;
	private JTextField Print;
	private String msg; // 화면 출력용(전체 입력값)
	private String input; // 자료구조add용
	private double sum; // 결과값 계산용
	private ArrayList <Double> num = new ArrayList <Double> (); // 자료구조(숫자)
	private ArrayList <String> op = new ArrayList <String> (); // 자료구조(연산자)
	
	

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

	public void Init(String msg, String input, double sum, ArrayList <Double> num, ArrayList <String> op) { // 속성 초기화용(중복 코드↓)
		this.msg = "";
		this.input = "";
		this.sum = 0;
		this.num.clear();
		this.op.clear();
	}
	
//	public void Init(String msg, String input, double sum) { // 속성 초기화용(중복 코드↓)
//		this.msg = "";
//		this.input = "";
//		this.sum = 0;
//	}
	
	public void IO(String msg, String input, JTextField Print, JButton btn) { // 마우스 클릭 이벤트 핸들러 InputOutput용(중복 코드↓)
		this.msg += btn.getText();
		this.input += btn.getText();
		this.Print.setText(this.msg);
	}

	public Calculator_Std_Ui() {
		
		Init(msg, input, sum, num, op);
		
		setTitle("\uD45C\uC900 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 590);
		
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '\n') { // 스페이스 키를 눌렀으면
                    Print.setText("0");
                }
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnChange = new JButton("\uBCC0\uD658");
		btnChange.setBounds(115, 117, 215, 74);
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Calculator_Sci_Ui().setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnChange);
		
		Print = new JTextField();
		
		Print.setBounds(5, 37, 439, 63);
		contentPane.add(Print);
		Print.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(5, 461, 215, 74);
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn0);
			}
		});
		btn0.setFont(new Font("굴림", Font.BOLD, 18));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(5, 375, 105, 74);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn1);
			}
		});
		btn1.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(115, 375, 105, 74);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn2);
			}
		});
		btn2.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(225, 375, 105, 74);
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn3);
			}
		});
		btn3.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(5, 289, 105, 74);
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn4);
			}
		});
		btn4.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(115, 289, 105, 74);
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn5);
			}
		});
		btn5.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(225, 289, 105, 74);
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn6);
			}
		});
		btn6.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(5, 203, 105, 74);
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn7);
			}
		});
		btn7.setFont(new Font("굴림", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(115, 203, 105, 74);
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn8);
				
			}
		});
		btn8.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(225, 203, 105, 74);
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btn9);
			}
		});
		btn9.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btn9);
		
		JButton btnEqu = new JButton("=");
		btnEqu.setBounds(335, 461, 105, 74);
		btnEqu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(op.size() == 0) {
					num.add(Double.parseDouble(input));
//					msg += btnEqu.getText();
//					Print.setText(msg);
					sum = num.get(0);
					num.remove(0);
					Print.setText("" + sum);
					
				} else {
					num.add(Double.parseDouble(input));
//					msg += btnEqu.getText();
//					Print.setText(msg);
					sum = num.get(0);
					num.remove(0);
					for (int i = 0; i < num.size(); i++) {
							switch(op.get(i)) {
								case "+":
									sum += num.get(i);
									Print.setText("" + sum);
									break;
								case "-":
									sum -= num.get(i);
									Print.setText("" + sum);
									break;
								case "x":
									sum *= num.get(i);
									Print.setText("" + sum);
									break;
								case "/":
									if (num.get(i) == 0) {
										Print.setText("0으로 나눌 수 없습니다");
										Init(msg, input, sum, num, op);
									}
									else {
										sum /= num.get(i);
										Print.setText("" + sum);
									}
									break;
						}
					}
					Init(msg, input, sum, num, op);
				}
			}
		});
		btnEqu.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btnEqu);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(335, 375, 105, 74);
		btnPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(num.size() == 1 | !op.isEmpty()) {
					
				} else {
					num.add(Double.parseDouble(input));
					IO(msg, input, Print, btnPlus);
					input = "";
					op.add(btnPlus.getText());
				}
				
			}
		});
		btnPlus.setFont(new Font("굴림", Font.BOLD, 22));
		contentPane.add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.setBounds(335, 289, 105, 74);
		btnSub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(num.size() == 1 | !op.isEmpty()) {
					
				}else {
					num.add(Double.parseDouble(input));
					IO(msg, input, Print, btnSub);
					input = "";
					op.add(btnSub.getText());
				}
			}
		});
		btnSub.setFont(new Font("굴림", Font.BOLD, 22));
		contentPane.add(btnSub);
		
		JButton btnMul = new JButton("x");
		btnMul.setBounds(335, 203, 105, 74);
		btnMul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(num.size() == 1 | !op.isEmpty()) {
					
				} else {
					num.add(Double.parseDouble(input));
					IO(msg, input, Print, btnMul);
					input = "";
					op.add(btnMul.getText());
				}
			}
		});
		btnMul.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(335, 117, 105, 74);
		btnDiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(num.size() == 1 | !op.isEmpty()) {
					
				} else {
					num.add(Double.parseDouble(input));
					IO(msg, input, Print, btnDiv);
					input = "";
					op.add(btnDiv.getText());
				}
			}
		});
		btnDiv.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btnDiv);
		
		JButton btnRes = new JButton("C");
		btnRes.setBounds(5, 117, 105, 74);
		btnRes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Print.setText("0");
				Init(msg, input, sum, num, op);
			}
		});
		btnRes.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(btnRes);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(225, 461, 105, 74);
		btnDot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IO(msg, input, Print, btnDot);
			}
		});
		btnDot.setFont(new Font("굴림", Font.BOLD, 30));
		contentPane.add(btnDot);

	}


	
}
