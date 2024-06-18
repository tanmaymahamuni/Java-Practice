import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Number of Students: ");
		int num=scn.nextInt();
		int choice=0;
		Student [] sarr = new Student[num];
		System.out.println("Enter Student Details: ");
		StudentService.addnewStudent(sarr);
		do {
	    
	    
		System.out.println("1.Display all Student");
		System.out.println("2.Search Student By ID \n3.Search Student By Name");
		System.out.println("4.Calculate GPA of a Particular Student \n5.Exit");
		System.out.println("Enter your Choice: ");
		choice=scn.nextInt();
		
		switch(choice)
		{
				
			case 1:
				StudentService.displayAllDetails(sarr);
				break;
				
			case 2:
				System.out.println("Enter stuent Id you want to display");
				int id=scn.nextInt();
				
				Student sobj=StudentService.searchById(sarr,id);
				System.out.println(sobj);
				break;
				
			case 3:
				System.out.println("Enter student Name you want to display");
				String name=scn.next();
				
				sobj=StudentService.searchByName(sarr,name);
				System.out.println(sobj);
				break;
				
			case 4:
				System.out.println("Enter stuent Id you want to calculate GPA of:");
				int sid=scn.nextInt();
				
				sobj=StudentService.displayGPA(sarr,sid);
				break;
				
			case 5:
				System.out.println("Thank you!!");
				scn.close();
				break;
				
			default:
				System.out.println("Wrong choice");
				break;
		}
		
		
		
		}while(choice!=5);	
	}

}
