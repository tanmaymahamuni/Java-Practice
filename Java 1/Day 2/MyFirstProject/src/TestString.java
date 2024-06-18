
public class TestString {

	public static void main(String[] args) {
		String s="test";
		String s1=new String("test");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		String s2="test";
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		StringBuffer sb=new StringBuffer("test");
		StringBuilder sbld=new StringBuilder("Welcome");
	}

}
