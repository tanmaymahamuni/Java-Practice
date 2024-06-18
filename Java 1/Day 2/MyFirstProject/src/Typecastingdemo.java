
public class Typecastingdemo {

	public static void main(String[] args) {
		int i=10;
		byte j=127;
		System.out.println(i);
		int x=j;  //implicit typecasting
		byte f=(byte)x;  //explicit typecasting
		
		long a=23;
		float f1=a; //why implicit typecasting is ok for long to float
        float s=34.5f;
        double d=45.6;
        
        ///  byte>short>int>long
        //long>float>double
	}

}
