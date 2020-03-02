package dao;
/**
 * 数据库操作工具类
 * @author lindy
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class basedao {
	// 定义需要用到的字符串内容
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/studnet?UseUnicode=true&characterEncoding=UTF-8";
	private final String USERNAME = "root";
	private final String PASSWORD = "root";
	
	// 创建需要使用的接口对象
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	
	// 获得数据库连接的方法
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
	
	// 释放资源
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
