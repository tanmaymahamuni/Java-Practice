import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonService {
	
	public static void addPersonData(Person[] arr) {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//accept person details
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter pid");
			int pid=sc.nextInt();  
			System.out.println("enter name");
			sc.nextLine(); //dummy nextline to remove enter from scanner buffer
			String nm=sc.nextLine();
			System.out.println("enter mobile");
			String m=sc.next();
			System.out.println("enter date of birth(dd/MM/yyyy)");
			String dt=sc.next();
			//to convert String to java.util.Date
			try {
				Date dt1=sdf.parse(dt);
				//create object
				arr[i]=new Person(pid,nm,m,dt1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void displayPersonData(Person[] parr) {
		for(int i=0;i<parr.length;i++) {
			System.out.println(parr[i]);
			
		}
		
	}

	public static Person searchPerson(Person[] arr,int pid) {
		for(Person p:arr) {   
			if(p.getPid()==pid) {
				return p;
			}
		}
		return null;
	}

	public static Person[] searchByName(Person[] parr, String nm) {
		Person[] data=new Person[parr.length]; 
		int cnt=0;
		for(Person p:parr) {   
			if(p.getPname().equalsIgnoreCase(nm)) {
				data[cnt]=p;
				cnt++;
			}
		}
		//if data found then return array
		if(cnt>0)
			return data;
		else
			return null;  //if data not found then return null
	}

}
