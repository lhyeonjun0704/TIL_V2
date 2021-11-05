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
	private Button b1 = new Button("BMI계산");
	private Label la1 = new Label("키를 입력하시오 : ");
	private Label la2 = new Label("몸무게를 입력하시오 : ");
	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();
	
	public BMIGUI2() {
		
		this.setLayout(null);
		
		b1.setSize(100,70);//버튼 크기 
        b1.setLocation(200,300); //버튼 내부위치 
        this.add(b1);//버튼 추가 
        b1.addActionListener(this); //////////////////버튼을 이벤트로 
            
        la1.setSize(90,30);
        la1.setLocation(20, 70);//라벨 내부위치 
        this.add(la1);//라벨추가 
 
        tf1.setSize(70,30);
        tf1.setLocation(120, 70);//텍스트 내부위치 
        this.add(tf1); 
            
        la2.setSize(90,30);
        la2.setLocation(20, 100);//라벨 내부위치 
        this.add(la2);//라벨추가 

        tf2.setSize(70,30);
        tf2.setLocation(120, 100);//텍스트 내부위치 
        this.add(tf2); 

        tf3.setSize(400,50);
        tf3.setLocation(20,400);//텍스트 내부위치 
        this.add(tf3);
           
        this.setSize(500, 500); //프레임 크기 
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
		
		if(e.getSource() == b1){ //버튼이 눌러졌으면(이벤트) 
            try { ///////////////                
                 int  ki= Integer.parseInt(tf1.getText());
                 int  mom=Integer.parseInt(tf2.getText());
           
		       double mki=ki/100.0;
		       double bmi=mom / Math.pow(mki,2);
		   
		       String result;
		       
		       if(bmi >=30.0)
		                result="비만";
		       else if(bmi >=25.0)
		                  result="과체중";
		       else if(bmi >=20.0)
		                   result="보통";
		       else 
		                  result="저체중";
	             
		       tf3.setText("당신의 bmi지수는"+bmi+"이며 "+result+"이군요"); 
            }catch(NumberFormatException e2){//////////
                    tf3.setText("키와 몸무게에 숫자를 넣어주세요"); 
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
