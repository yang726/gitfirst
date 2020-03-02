package entity;

import java.util.List;
import java.util.Map;

public class student {

private String id;


public student(String id, String stuname, int age) {
	super();
	this.id = id;
	this.stuname = stuname;
	this.age = age;
}
private String  stuname ;
public student() {
	super();
}
private int age;

public String getStuname() {
	return stuname;
}
public void setStuname(String stuname) {
	this.stuname = stuname;
}


public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

}
