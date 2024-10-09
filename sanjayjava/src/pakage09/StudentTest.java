package pakage09;

public class StudentTest {

	public static void main(String[] args){
		Student s = new Student();
		//Student s1 = new Student();
		StudentTest st = new StudentTest();
		s.setName("Ram");
		System.out.println(s.getName());
		s.setAddress("Kathmandu");
		System.out.println(s.getAddress());
	}
}
