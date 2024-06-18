import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentService {
	public static void AcceptData(Student[] sarr)
	{
Scanner sc = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
for(int i=0;i<sarr.length;i++)
{
	System.out.println("Enter Id:");
	int SId = sc.nextInt();
	System.out.println("Enter Name:");
	String SName = sc.next();
	System.out.println("Enter Date Of Admission(dd/MM/yyyy):");
	String Date1 = sc.next();
	//sc.close();
	try
	{
		Date DOA = sdf.parse(Date1);
		sarr[i] = new Student(SId,SName,DOA);
	}
	catch(ParseException e)
	{
		e.printStackTrace();
	}
}
}
	public static void displayStudentData(Student[] sarr1) {
		for(int i=0;i<sarr1.length;i++) {
			System.out.println(sarr1[i]);
			
		}
		
	}
	public Student searchById(Student[] sarr,int SId) {
		for(Student s:sarr) {   
			if(s.getId()==SId) {
				System.out.println(s);
			}
		}
		return null;
	}
	public void searchByName(Student[] stuarr, String sname) {
		Student [] arr1 = new Student[stuarr.length];
		for(Student d:stuarr)
		{
			if(d.getName().equalsIgnoreCase(sname))
			{System.out.println(d);}
		}
		
	}
	
}