package FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	public String name;
	public String address;
	public int sid;
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Ram";
		s.address = "Kathmandu";
		s.sid = 1;
		try {
			FileOutputStream fileOut = new FileOutputStream("F:\\KnK College\\JAVA\\file.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(s);
			out.close();
			fileOut.close();
			System.out.println("Objects are serialized and saved successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
