import java.util.Scanner;
public class ArrayService {

	public static void addnewdata(int[][] arr2) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println("enter number at row "+i+"Column"+j);
				arr2[i][j]=sc.nextInt();
			}
		}
	//	sc.close();
	}

	public static void displaydata(int[][] arr2) {
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
		
	}
	public static void transpose(int[][] arr2)
	{
		for(int i=0; i<arr2.length; i++) 
		{
			for(int j=0;j<arr2[i].length; j++) 
			{
				System.out.print(arr2[j][i]+"\t");
			}
			System.out.println();
	}
}
	public static void RowwiseAdd(int[][] arr2)
	{int sum=0;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
			
			sum=arr2[i][j]+sum;
			
			}
			System.out.println("Sum of row "+i+"="+sum);
			sum=0;
		}
	}
	public static void CloumnwiseAdd(int[][] arr2)
	{int sum=0;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
			
			sum=arr2[j][i]+sum;
			
			}
			System.out.println("Sum of column "+i+"="+sum);
			sum=0;
		}
	}
}