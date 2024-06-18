
public class TestOverloading {
	public static int add(int x,int y) {
		System.out.println("in int add");
		return x+y;
	}
	public static int add(int x,int y,int z) {
		System.out.println("in int add");
		return x+y+z;
	}
	public static Integer add(Integer x,Integer y) {
		System.out.println("in Integer add");
		return x+y;
	}
	public static long add(long x,long y) {
		System.out.println("in long add");
		return x+y;
	}
	public static float add(float x,float y) {
		System.out.println("in float add");
		return x+y;
	}

	public static void main(String[] args) {
		add(12,13);
		//add(12.5f,13.7f);

	}

}
