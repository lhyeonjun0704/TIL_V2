package Aca1101;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BMIGUI2 extends Frame implements ActionListener {
	private Button b1 = new Button("BMI���");
	private Label la1 = new Label("Ű�� �Է��Ͻÿ� : ");
	private Label la2 = new Label("�����Ը� �Է��Ͻÿ� : ");
	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();
	
	public BMIGUI2() {
		
		this.setLayout(null);
		
		b1.setSize(100,70);//��ư ũ�� 
        b1.setLocation(200,300); //��ư ������ġ 
        this.add(b1);//��ư �߰� 
        b1.addActionListener(this); //////////////////��ư�� �̺�Ʈ�� 
            
        la1.setSize(90,30);
        la1.setLocation(20, 70);//�� ������ġ 
        this.add(la1);//���߰� 
 
        tf1.setSize(70,30);
        tf1.setLocation(120, 70);//�ؽ�Ʈ ������ġ 
        this.add(tf1); 
            
        la2.setSize(90,30);
        la2.setLocation(20, 100);//�� ������ġ 
        this.add(la2);//���߰� 

        tf2.setSize(70,30);
        tf2.setLocation(120, 100);//�ؽ�Ʈ ������ġ 
        this.add(tf2); 

        tf3.setSize(400,50);
        tf3.setLocation(20,400);//�ؽ�Ʈ ������ġ 
        this.add(tf3);
           
        this.setSize(500, 500); //������ ũ�� 
        this.setVisible(true);
        
        addWindowListener(new WindowAdapter(){ //////////////////
            public void windowClosing(WindowEvent e1){
                    dispose();
                    System.exit(0);
                    
            }
        });
            
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == b1){ //��ư�� ����������(�̺�Ʈ) 
            try { ///////////////                
                 int  ki= Integer.parseInt(tf1.getText());
                 int  mom=Integer.parseInt(tf2.getText());
           
		       double mki=ki/100.0;
		       double bmi=mom / Math.pow(mki,2);
		   
		       String result;
		       
		       if(bmi >=30.0)
		                result="��";
		       else if(bmi >=25.0)
		                  result="��ü��";
		       else if(bmi >=20.0)
		                   result="����";
		       else 
		                  result="��ü��";
	             
		       tf3.setText("����� bmi������"+bmi+"�̸� "+result+"�̱���"); 
            }catch(NumberFormatException e2){//////////
                    tf3.setText("Ű�� �����Կ� ���ڸ� �־��ּ���"); 
            }catch(Exception e2){////////////////
                    tf3.setText(e2.getMessage());
            }
         }
	}
	
}


public class BMIGUI extends Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BMIGUI2();
	}

}
