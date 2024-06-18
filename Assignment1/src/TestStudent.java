import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		StudentService ss = new StudentService();
		
		Student[] stuarr = new Student[2];
		StudentService.AcceptData(stuarr);
		s.CalculatePercentage(stuarr);
		StudentService.displayStudentData(stuarr);
		
		System.out.println("Enter ID to be searched");
		int Id = sc.nextInt();
		ss.searchById(stuarr, 1);
		System.out.println("Enter Name to be searched:");
		String sname = sc.next();
		ss.searchByName(stuarr,sname);
		sc.close();
		
	}

}

