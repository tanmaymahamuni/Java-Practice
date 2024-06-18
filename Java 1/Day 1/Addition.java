class Addition{
    public static void main(String[] args){
	  System.out.println("Numbe rof arguments: "+ args.length);
	  int s=0;
	  for(int i=0;i<args.length;i++){
	     // Integer.parseInt is a function which will covert
		 //string into number
	     s=s+Integer.parseInt(args[i]);
	  }
	  System.out.println("Answer: "+s);
	
	}
}