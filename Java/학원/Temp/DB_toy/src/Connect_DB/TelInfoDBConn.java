package Connect_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelInfoDBConn {
	private Connection con; // ���Ӱ�ü
	
	public Connection getConnection() { //getter
		return con;
	}
	
	public TelInfoDBConn() throws ClassNotFoundException, SQLException {// ������
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("���ӿϷ�");
	}
	
}
