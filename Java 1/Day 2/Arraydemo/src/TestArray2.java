
public class TestArray2 {
	public static void main(String[] args) {
		int[][] arr= {{3,4,5},{6,7,8},{1,15,23}};
		int sum1=0,sum2=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				sum1=sum1+arr[i][j]; //sum of rows
				sum2=sum2+arr[j][i]; //sum of columns
			}
			System.out.println("Sum of row "+i+":"+sum1);
			sum1=0;
			System.out.println("Sum of column "+i+":"+sum2);
			sum2=0;
		}
		
	}
}
