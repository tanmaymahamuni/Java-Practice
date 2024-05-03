import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	int id;
	String name;
	Date DOA;
	float marks1;
	float marks2;
	float marks3;
	
	public Student()
	{
		id=0;
		name=null;
		DOA=null;
		marks1=0;
		marks2=0;
		marks3=0;
	}
	public Student(int i, String nm, Date d, float m1, float m2, float m3)
	{
		id=i;
		name=nm;
		DOA=d;
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
	public void setId(int i)
	{
		id=i;
	}
	public void setName(String nm)
	{
		name=nm;
	}
	public void setDate(Date d)
	{
		DOA=d;
	}
	public void setMarks1(int m1)
	{
		marks1=m1;
	}
	public void setMarks2(int m2)
	{
		marks2=m2;
	}
	public void setMarks3(int m3)
	{
		marks3=m3;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Date getDate()
	{
		return DOA;
	}
	public float getMarks1()
	{
		return marks1;
	}
	public float getMarks2()
	{
		return marks2;
	}
	public float getMarks3()
	{
		return marks3;
	}
	public String toString()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Id= "+id+", "+"Name= "+name+", "+"Date of admission= "+sdf.format(DOA)+", "+"Marks1= "+marks1+", "+"Marks2= "+marks2+", "+"Marks3= "+marks3;
	}
}
