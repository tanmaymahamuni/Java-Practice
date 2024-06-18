
public class TestStudent {

	public static void main(String[] args) {
		
		Student [] student = new Student[2];
		StudentService.addStudentDetails(student);
		StudentService.displayStudentDetails(student);

	}

}
