package sam;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorex {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
list.add("Rose");
list.add("Sunflower");
list.add("Jasmine");
list.add("Lotus");
Iterator itr=list.iterator();
while(itr.hasNext()) {//hasnext gives next data and so on
	System.out.println(itr.next());
}
}
}
