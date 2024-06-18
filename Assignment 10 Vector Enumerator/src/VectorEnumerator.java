import java.util.Enumeration;
import java.util.Vector;
public class VectorEnumerator {

	public static void main(String[] args) {
		
		Vector<String> vect = new Vector<>();
		
		vect.add("Tejas");
		vect.add("Tanmay");
		vect.add("Tanuja");
		
		System.out.println("Printing the vector Element: "+ vect);
		
		vect.add("Technical Tanmay");
		Enumeration<String> enu = vect.elements();
		System.out.println("Using Enumerator: ");
		
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement()+" ");
		}
		
	}

}
