import java.util.ArrayList;

public class Student {
	private String id;
	private String name;
	private String major;
	private String birthdate;
public ArrayList<Course> Course ;

public Student() {
	id="";
	name="";
	major="";
	birthdate="";
	Course=new ArrayList<Course>();
}

public Student(String id, String name,String major,String birthdate, String cno,int crh, int grades) {
	this.id=id;
	this.name=name;
	this.major=major;
	this.birthdate=birthdate;
	Course.get(0).setCno(cno);
	Course.get(1).setCrh(crh);
	Course.get(2).setGrades(grades);
}

public void setId(String id1) {id=id1;}
public String getId() {return this.id;}

public void setName(String name) {this.name=name;}
public String getName() {return this.name;}

public void setMajor(String major) {this.major=major;}
public String getMajor() {return this.major;}

public void setBirth(String birthdate) {this.birthdate=birthdate;}
public String getBirth() {return this.birthdate;}



}