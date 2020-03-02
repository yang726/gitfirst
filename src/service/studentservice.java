package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.studengdao;
import entity.student;

public class studentservice {
	studengdao d=new studengdao();
	public Map<String, List> getLists(student stu) {
		// TODO Auto-generated method stub
		Map<String, List> lists=new HashMap<String, List>();
	    lists.put("one", d.pan(stu));
		return lists;
	}
}
