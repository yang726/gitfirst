package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.student;

public  class studengdao  extends basedao {
	 Connection con;
	 PreparedStatement pst;
	 ResultSet rs;
	 public ArrayList<student> pan(student s) {
			
			ArrayList<student> list=new ArrayList<student>();
			try {
				con=getcon();
				String sql="SELECT * from user where id=?"; 
					pst=con.prepareStatement(sql);
					pst.setString(1,s.getId());
	               rs=pst.executeQuery();
		       while (rs.next()) {	
		    	   list.add(new student(rs.getString(1),rs.getString(2),rs.getInt(3)));
		    	   }
		       System.out.println(list);
			} catch (SQLException e) {
			     	e.printStackTrace();
			}finally{
				closeall(rs, pst, con);
			}
			return list;
	}
	 
}
