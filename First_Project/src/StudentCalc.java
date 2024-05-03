import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentCalc {
	public void enterStudentdata()
	{
		
		for(int i=0;i<2;i++)
		{
			int id;
			String name;
			String date;
			Date DOA = null;
			float m1;
			float m2;
			float m3;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter student id");
			id=s.nextInt();
			System.out.println("Enter name");
			name=s.next();
			System.out.println("Enter date of admission");
			date=s.next();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				DOA=sdf.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter marks1");
			m1=s.nextFloat();
			System.out.println("Enter marks2");
			m2=s.nextFloat();
			System.out.println("Enter marks3");
			m3=s.nextFloat();
			
			
			student[i]=new Student(id,name,DOA,m1,m2,m3);
		}
	}
	public void showStudentData()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println(student[i].toString());
		}

	}

}
