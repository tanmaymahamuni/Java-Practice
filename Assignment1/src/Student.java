import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
private int SId;
private String SName;
private Date DateOfAD;
private int M1,M2,M3;

public Student()
{}

public Student(int Id,String Name,Date DOA)
{
	this.SId=Id;
	SName=Name;
	DateOfAD=DOA;
}
public Student(int m1,int m2,int m3)
{
	this.M1=m1;
	this.M2=m2;
	this.M3=m3;
}
public void setSId(int Id)
{
	this.SId=Id;
}
public void setSName(String Name)
{
	this.SName=Name;
}
public void setDate(Date DOA)
{
	this.DateOfAD=DOA;
}

public int getId()
{
	return SId;
}
public String getName()
{
	return SName;
}
public Date getDate()
{
	return DateOfAD;
}


public String toString(){
	   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	   String d =sdf.format(DateOfAD);
	   System.out.println("Enter Your Date:"+DateOfAD);
 return "Id: " + SId + "Name: " +SName+ "Date of Admission: "+d;
}
Scanner sc = new Scanner(System.in);

public void CalculatePercentage(Student[] arr)
{
	for(int i = 0; i< arr.length; i++)
	{
		float sum=0;
		System.out.println("Enter Marks of Student1 and Student 2:");
		System.out.println("Enter M1:");
		M1=sc.nextInt();
		System.out.println("Enter M2:");
		M2=sc.nextInt();
		System.out.println("Enter M3:");
		M3=sc.nextInt();
		sum=M1+M2+M3;
		float Percentage=(sum/300)*100;
		System.out.println("Your Percentage is:"+Percentage);
	}
	
}
}
