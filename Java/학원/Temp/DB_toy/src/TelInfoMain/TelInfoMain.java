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
			System.out.println("비상연락망관리");
			System.out.println("---------------------------------");
			System.out.println("1: 추가");
			System.out.println("2: 수정");
			System.out.println("3: 삭제");
			System.out.println("4: 전체출력");
			System.out.println("5: 종료");
			System.out.println("---------------------------------");
			System.out.println("번호를 입력해주세요");
			
			sel = Integer.parseInt(JOptionPane.showInputDialog("번호입력"));
			switch(sel) {
			
			case 1:
				int id = Integer.parseInt(JOptionPane.showInputDialog("아이디 입력 : "));
				String name = JOptionPane.showInputDialog("이름 입력");
				String tel = JOptionPane.showInputDialog("전화번호 입력 : ");
				String sDate = JOptionPane.showInputDialog("날짜 입력 : ");
				
				boolean b1 = tidao.insert_nametel(id, name, tel, sDate);
				if(b1) System.out.println("insert succeess");
				else System.out.println("insert error");
				break;
				
			case 2:
				int n1 = Integer.parseInt(JOptionPane.showInputDialog("아이디 입력 : "));
				String name_u = JOptionPane.showInputDialog("이름 입력");
				String tel_u = JOptionPane.showInputDialog("전화번호 입력 : ");
				String sDate_u = JOptionPane.showInputDialog("날짜 입력 : ");
				
				boolean b2 = tidao.update_nametel(n1, name_u, tel_u, sDate_u);
				if(b2) System.out.println("Update success");
				else System.out.println("update error");
				break;
			
			case 3:
				int delid = Integer.parseInt(JOptionPane.showInputDialog("아이디 입력 : "));
				
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

