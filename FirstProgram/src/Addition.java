public class Addition {

	public static void main(String[] args) {
		System.out.println("Numbe rof arguments: "+ args.length);
		  int s=0;
		  for(int i=0;i<args.length;i++)
		  {
		     s=s+Integer.parseInt(args[i]);
		  }
		  
		  System.out.println("Answer: "+s);
	}
}
