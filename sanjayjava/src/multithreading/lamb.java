package multithreading;

import java.util.ArrayList;
import java.util.List;

public class lamb {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("orange");
		list.add("banana");
		
		
		//lambda expression
		list.forEach(p->System.out.println(p));
		list.forEach(p->{
			if(p.equals("mango")) {
				System.out.println("Price is: Rs "+200);
			}
		});
	}
}
