
import java.util.Date;
import java.text.SimpleDateFormat;

public class Person{
	static int count;
	static {
		count=0;
	}
	
   private String pid;
   private String pname;
   private String mob;
   private Date dob;
   private final int tax;
   //default constructor
    public Person(){
        this.pid=generatecode(null);
       	pname=null;
		mob=null;
		this.dob=null;
		tax=10;
		//calling parametrized constructor of same class
		//this(0,null,null,null);
   } 
    //parametrized constructor
   public Person(int id){
      //this(id,null,null,null);
	  pid=generatecode(null);
	  tax=5;
      
   }
   private String generatecode(String nm){
	   count++;
	   if(nm==null)
		   return ""+count;
	   else {
		   String code= nm.substring(0,3)+count;
	   	   return code;
	   	   }
   }
   //parametrized constructor
   public Person(String nm,String m,Date dob){
        this.pid=generatecode(nm);
		pname=nm;
		mob=m;
		this.dob=dob;
		tax=20;
   } 
   //setter and getter methods
   /*public void setPid(String id){
      this.pid=id;
   }*/
   public void setPname(String nm){
      this.pname=nm;
   }
    public void setMob(String m){
      this.mob=m;
   }
    public void setDOB(Date d){
      this.dob=d;
   }
   public String getPid(){
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
