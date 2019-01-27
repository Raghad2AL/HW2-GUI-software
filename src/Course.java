public class Course {
private String cno ;
private double crh;
private double grades;

public  Course() {
	this.cno="";
	this.crh=0.0;
	this.grades=0.0;
}
public Course(String cno, double crh, double grades) {
	this.cno=cno;
	this.crh=crh;
	this.grades=grades;
}
public void setCno(String cno) {	this.cno=cno;}
public String getCno() {return this.cno;}

public void setCrh(double crh) {this.crh=crh;}
public double getCrh() {return this.crh;};

public void setGrades(double grades) {this.grades=grades;}
public double getGrades() {return this.grades;}

}
