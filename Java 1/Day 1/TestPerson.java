import java.util.Date;
class TestPerson{
   public static void main(String[] args){
     Person p=new Person(12,"Rajan","456445",new Date());
	 p.setMob("55555");
	 System.out.println(p); // it will call toString method of Person
	 System.out.println("Mobile: "+p.getMob());
   }
}