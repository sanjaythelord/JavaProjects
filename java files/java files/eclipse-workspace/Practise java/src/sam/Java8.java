package sam;

import java.util.ArrayList;
import java.util.List;

public class Java8 {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("Apple");
	list.add("Mango");
	list.add("Orange");
	list.forEach(n-> System.out.println("Fruit: "+n));
	//using stream
	System.out.println("*****Using stream:*****");
	list.parallelStream().forEach(n-> System.out.println("Fruit: "+n));
	System.out.println("*****After deleting Apple:******");
	list.forEach(n->{if(!("Apple").equals(n)) {//filtering
		System.out.println(n);
	}
	});

}
}
