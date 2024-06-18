import java.util.Scanner;

class HelloWorld{

   public static void main(String[] args){
      System.out.println("Hello world!!!");
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter number 1");
	  int num1=sc.nextInt();
	  System.out.println("enter number 2");
	  int num2=sc.nextInt();
	  int ans=num1+num2;
	  System.out.println("Answer : "+ans);
   }

   

}