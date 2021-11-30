package TelInfoMain;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import TelInfoDAO.TelInfoDAO;
import TelInfoVO.TelInfoVO;

public class TelInfoMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int sel = 0;
		TelInfoDAO tidao = new TelInfoDAO();
		do {
			System.out.println("��󿬶�������");
			System.out.println("---------------------------------");
			System.out.println("1: �߰�");
			System.out.println("2: ����");
			System.out.println("3: ����");
			System.out.println("4: ��ü���");
			System.out.println("5: ����");
			System.out.println("---------------------------------");
			System.out.println("��ȣ�� �Է����ּ���");
			
			sel = Integer.parseInt(JOptionPane.showInputDialog("��ȣ�Է�"));
			switch(sel) {
			
			case 1:
				int id = Integer.parseInt(JOptionPane.showInputDialog("���̵� �Է� : "));
				String name = JOptionPane.showInputDialog("�̸� �Է�");
				String tel = JOptionPane.showInputDialog("��ȭ��ȣ �Է� : ");
				String sDate = JOptionPane.showInputDialog("��¥ �Է� : ");
				
				boolean b1 = tidao.insert_nametel(id, name, tel, sDate);
				if(b1) System.out.println("insert succeess");
				else System.out.println("insert error");
				break;
				
			case 2:
				int n1 = Integer.parseInt(JOptionPane.showInputDialog("���̵� �Է� : "));
				String name_u = JOptionPane.showInputDialog("�̸� �Է�");
				String tel_u = JOptionPane.showInputDialog("��ȭ��ȣ �Է� : ");
				String sDate_u = JOptionPane.showInputDialog("��¥ �Է� : ");
				
				boolean b2 = tidao.update_nametel(n1, name_u, tel_u, sDate_u);
				if(b2) System.out.println("Update success");
				else System.out.println("update error");
				break;
			
			case 3:
				int delid = Integer.parseInt(JOptionPane.showInputDialog("���̵� �Է� : "));
				
				boolean del = tidao.delete_nametel(delid);
				if(del) System.out.println();
				else System.out.println();0
				break;
				
			case 4:
				System.out.println(1);
				ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();
				for(TelInfoVO imsi : tiArray) {
					System.out.print(imsi.getId() + "\t");
					System.out.print(imsi.getName() + "\t");
					System.out.print(imsi.getTel() + "\t");
					System.out.println(imsi.getD());
					System.out.println(1);
				}
				System.out.println(tiArray);
				break;
			case 5:
				System.exit(1);
				break;
			}
		}while(sel != 5);
	}

}

