package sam;
//individual objects is collected in single entity called list
import java.util.ArrayList;
//importing class Person to current class

public class TestPerson {
public static void main(String[] args) {
	ArrayList<Person> list=new ArrayList<Person>();
	Person p1=new Person("Sanjay",22);
	Person p2=new Person("Sam",20);
	list.add(p1);
	list.add(p2);
	for(Person p:list) {//p is the reference variable of class person
		System.out.println("Name: "+p.getName()+" Age: "+p.getAge());
		
	}
}
}
