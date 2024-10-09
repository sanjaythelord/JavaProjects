package sam;

import java.util.ArrayList;
public class TestPerson2 {
ArrayList<Person>getAllPerson(){
	ArrayList<Person> list=new ArrayList<Person>();//creating ArrayList<Person>'s collection i.e.list or list is a variable or obj.
	Person p1=new Person("Sanju",22);
	Person p2=new Person("Sam",20);
	list.add(p1);
	list.add(p2);
	return list;
}
//do integer type return type also 
public static void main(String[] args) {
	TestPerson2 b=new TestPerson2();
	ArrayList<Person> li=b.getAllPerson();
	for(Person w:li) {//p is the reference variable of class person
		System.out.println("Name: "+w.getName()+" Age: "+w.getAge());
}
}
}
