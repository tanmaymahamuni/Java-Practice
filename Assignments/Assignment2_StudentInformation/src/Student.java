
public class Student {
	
	private int sid;
	private String sname;
	private float m1;
	private float m2;
	private float m3;
	
	//Default Constructor
	public Student()
	{
		sid=0;
		sname=null;
		m1=0;
		m2=0;
		m3=0;
	}
	
	//Parameterized Constructor
	public Student(int sid,String sname,float m1,float m2,float m3)
	{
		this.sid=sid;
		this.sname=sname;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	//setters and getters for all class members
	public int getSid() {
		return sid;
	}
	
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getM1() {
		return m1;
	}

	public void setM1(float m1) {
		this.m1 = m1;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}

	public float getM3() {
		return m3;
	}

	public void setM3(float m3) {
		this.m3 = m3;
	}
	
	
	public String toString()
	{
		System.out.println("Students Details: ");
		System.out.println("--------------------------");
		System.out.println("");
		return "Student Id : "+sid+"\nName: "+sname+"\nM1: "+m1+"\nM2: "+m2+"\nM3: "+m3+"\n";
	}
}
