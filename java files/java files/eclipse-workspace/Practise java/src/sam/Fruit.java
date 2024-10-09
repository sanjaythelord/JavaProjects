package sam;
import java.util.LinkedList;//importing LinkedList
public class Fruit {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Banana");
		list.add("Cherry");
		list.addFirst("Apple");
		list.add("Dragon fruit");
		list.remove(3);//dragon fruit is removed
		System.out.println(list);
	}
	}//do vector also
