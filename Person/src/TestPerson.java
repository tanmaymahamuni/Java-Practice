import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person(12,"Raghav","456445",new Date());
		 p.setPMob("9865471234");
		 System.out.println(p); // it will call toString method of Person
		 System.out.println("Mobile: "+p.getMob());
	
		 
	}
}

