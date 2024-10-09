package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Serialization is a mechanism of converting the state of an object
//into a byte stream. Deserialization is the reverse process where the
//byte stream is used to recreate the actual Java object in memory.

/*The reverse operation of serialization is called deserialization 
 * where byte-stream is converted into an object. The serialization 
 * and deserialization process is platform-independent, 
 * it means you can serialize an object on one platform and 
 * deserialize it on a different platform.

For serializing the object, 
we call the writeObject() method of ObjectOutputStream class,
and for deserialization we call the readObject() method of 
ObjectInputStream class.*/
public class Student2 implements Serializable {
	public String name;
	public String address;
	public int sid;
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.name = "Ram";
		s.address = "Kathmandu";
		s.sid = 1;
		try {
			FileOutputStream fileOut = new FileOutputStream("F:\\KnK College\\JAVA\\file.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(s);//serialization
			out.close();
			fileOut.close();
			System.out.println("Objects are serialized and saved successfully");
			FileInputStream fileIn = new FileInputStream("F:\\KnK College\\JAVA\\file.txt");
			
			ObjectInputStream in = new ObjectInputStream(fileIn);
			s = (Student2) in.readObject();//deserialization
			in.close();
			fileIn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nDeserialized Student...");
		System.out.println("Name: "+s.name);
		System.out.println("Address: "+s.address);
		System.out.println("Id: "+s.sid);
}
}