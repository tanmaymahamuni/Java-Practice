import java.util.Scanner;

public class StudentService {

	public static void addnewStudent(Student[] sarr) {
		
			Scanner scn=new Scanner(System.in);
			
			
		  
			for(int i=0;i<sarr.length;i++)
			{
				
				System.out.println("Enter Student Id: ");
				int id=scn.nextInt();
		
				System.out.println("Enter Student Name: ");
				String name=scn.next();
		
				System.out.println("Enter Marks 1");
				float m1=scn.nextFloat();
		
				System.out.println("Enter Marks 2");
				float m2=scn.nextFloat();
		
				System.out.println("Enter Marks 3");
				float m3=scn.nextFloat();
		
				sarr[i] = new Student(id,name,m1,m2,m3);
		}
	}

	public static void displayAllDetails(Student[] sarr) {
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println(sarr[i]);
		}

		
	}

	public static Student searchById(Student[] sarr, int id) {
		for(Student s:sarr)
		{
			if(s.getSid()==id)
			{
				return s;
			}
		}
		
		return null;
	}

	public static Student searchByName(Student[] sarr, String name) {
		
		for(Student s:sarr)
		{
			if(s.getSname().equals(name));
			{
				return s;
			}
		}
		return null;
	}

	public static Student displayGPA(Student[] sarr, int sid) {
		
		return null;
	}

	
}
