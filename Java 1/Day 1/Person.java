import java.util.Date;
import java.text.SimpleDateFormat;
class Person{
   private int pid;
   private String pname;
   private String mob;
   private Date dob;
   //default constructor
    public Person(){
       /* this.pid=0;
		pname=null;
		mob=null;
		this.dob=null;*/
		//calling parametrized constructor of same class
		this(0,null,null,null);
   } 
    //parametrized constructor
   public Person(int id){
      this(id,null,null,null);
   }
   //parametrized constructor
   public Person(int pid,String nm,String m,Date dob){
        this.pid=pid;
		pname=nm;
		mob=m;
		this.dob=dob;
   } 
   //setter and getter methods
   public void setPid(int id){
      this.pid=id;
   }
   public void setPname(String nm){
      this.pname=nm;
   }
    public void setMob(String m){
      this.mob=m;
   }
    public void setDOB(Date d){
      this.dob=d;
   }
   public int getPid(){
       return pid;
   }
   public String getPname(){
       return pname;
   }
   public String getMob(){
       return mob;
   }
   public Date getDOB(){
       return dob;
   }
   public String toString(){
	   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	   String d=sdf.format(dob);
      return "Id :"+ pid+"Name : "+pname+"mobile: "+mob+"dob"+d;
   }
   
}