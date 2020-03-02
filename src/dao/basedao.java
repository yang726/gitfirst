package dao;
/**
 * ���ݿ����������
 * @author lindy
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class basedao {
	// ������Ҫ�õ����ַ�������
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/studnet?UseUnicode=true&characterEncoding=UTF-8";
	private final String USERNAME = "root";
	private final String PASSWORD = "root";
	
	// ������Ҫʹ�õĽӿڶ���
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	
	// ������ݿ����ӵķ���
	public Connection getcon() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	// �ͷ���Դ
	public void closeall(ResultSet rs,PreparedStatement pst,Connection con) {
		try {
			if(rs != null)
				rs.close();
			if(pst != null)
				pst.close();
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
