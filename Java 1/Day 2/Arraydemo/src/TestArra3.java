import java.util.Scanner;

public class TestArra3 {

	public static void main(String[] args) {
		int[][] arr2=new int[3][3];
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. add data\n 2. display data\n3. transpose of matrix\n");
		System.out.println("4. rowwise sum\n 5. columnwise sum\n6. matrix multiplication\n");
		System.out.println("7.matrix addition\n 8. find maximum of array\n");
		System.out.println("9. find maximum row wise\n 10. find max columnwise\n11. exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			ArrayService.addnewdata(arr2);
			break;
		case 2:
			ArrayService.displaydata(arr2);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
				break;
		case 9:
			break;
		case 10:
			break;
		
		case 11:
			//System.exit(0);
			sc.close();
			System.out.println("Thank you for visiting....");
		default:
			System.out.println("Wrong choice");
			break;
		}
		
		}while(choice!=8);
	}

}
