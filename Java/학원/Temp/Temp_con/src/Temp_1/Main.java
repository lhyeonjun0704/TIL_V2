package Temp_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Connection con1 = null; // ���Ӱ�ü con 1 ���� // ctr1 + shift+o �� import
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); // ����Ŭ ����̹��ε�(ojdbc8.jar, ojdbc6.jar)
		// ��ҹ���, ���� x, ����ƽ�޼ҵ�(new ���� ���) ��ü.�޼ҵ�() => Ŭ����.����ƽ�޼ҵ�()
		//1)add throws declaration~
		//2) surround with try/catch
		
		// db ���� / Ŭ����.����ƽ�޼ҵ�()
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
		
		System.out.println("���� �Ϸ�"); // Ŭ����.����ƽ �޼ҵ�()
		
		// c:\program files\java\jdk.../jre/lib/ext ���� ojdbc6.jar �ֱ�
		//������ ���ʿ��� .java run as -java apllication
	}

}
