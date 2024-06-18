import java.util.Scanner;

public class StudentService {

	public static void addStudentDetails(Student[] student) {
		
		Scanner scn=new Scanner(System.in);
		
		for(int i=0;i<student.length;i++)
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
		
			student[i] = new Student(id,name,m1,m2,m3);
		}
		
	}

	public static void displayStudentDetails(Student[] student) {
		
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
		
	}
	
	
	
}
