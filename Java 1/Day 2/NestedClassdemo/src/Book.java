
public class Book {
	private int bid;
	private String bname;
	class Lesson{
		private int lid;
		private String lname;
		public Lesson(int lid,String lname) {
			this.lid=lid;
			this.lname=lname;
		}
		public void method1() {
			System.out.println("in method 1");
		}
	}

}
