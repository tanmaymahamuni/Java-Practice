import java.util.Date;
import java.text.SimpleDateFormat;

public class Person {
private int pid;
private String pname;
private String mob;
private Date DOB;
//default constructor
 public Person(){
	 this(0,null,null,null);
		
}
 public Person(int pid){
     this(pid,null,null,null);
  }
 public Person(int pid,String name,String m,Date dob)
 {
	 this.pid= pid;
	 pname=name;
	 mob=m;
	 DOB=dob;
 }
 public void setPId(int pid)
 {
	 this.pid=pid;
 }
 public void setPName(String name)
 {
	 this.pname=name;
 }
 public void setPMob(String m)
 {
	 this.mob=m;
 }
 public void setDate(Date dob)
 {
	 this.DOB=dob;
 }
 public int getPId()
 {
	 return pid;
 }
 public String getName()
 {
	 return pname;
 }
 public String getMob()
 {
	 return mob;
 }
 public Date getDob()
 {
	 return DOB;
 }
 public String toString(){
	   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	   String d=sdf.format(DOB);
    return "Id: " + pid + "Name: " +pname+ "Mobile: " +mob+ "DOB: "+d;
 
}
}
