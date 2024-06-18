import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		int[] a=new int[5];
		int[] a1= {3,4,5,6,7,8};  //initialization
		int[][] a2= {{2,2,},{3,4}}; //initialization
		int[][] a3=new int[3][5];
		Scanner sc=new Scanner(System.in);
		//accept data
		for(int i=0;i<a3.length;i++) //rows
		{
			for(int j=0;j<a3[i].length;j++) //columns
			{
				System.out.println("enter number row "+i +"Column :"+j);
				a3[i][j]=sc.nextInt();
			}
	}
			
			//display data
			for(int i=0;i<a3.length;i++) //rows
			{
				for(int j=0;j<a3[i].length;j++) //columns
				{
					System.out.print(a3[i][j]+"\t");
				}
				System.out.println();
		}
			
		int [][] b=new int[3][];
		//accept data
		for(int i=0;i<b.length;i++) {
			System.out.println("how many columns in the row "+i);
			int num=sc.nextInt();//accept number of columns for each row
			b[i]=new int[num];
			for(int j=0;j<b[i].length;j++) {
				System.out.println("enetr data");
				b[i][j]=sc.nextInt();
			}
		}
		
		//display data
		for(int i=0;i<b.length;i++) {
		  for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+"\t");
			}
		  System.out.println();
		}
		
	}
	
	
	
	
	
	

}
	
