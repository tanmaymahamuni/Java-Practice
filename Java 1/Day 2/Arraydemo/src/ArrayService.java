import java.util.Scanner;

public class ArrayService {

	public static void addnewdata(int[][] arr2) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println("enetr number at row "+i+"Column"+j);
				arr2[i][j]=sc.nextInt();
			}
		}
		
		
	}

	public static void displaydata(int[][] arr2) {
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]);
			}
		}
		
	}

}
