package CollectionFramework;
// we need to make ArrayList a type safe by using generics.
import java.util.ArrayList;

public class MultipleDataType {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

        al.add("Java");
        al.add(12);
        al.add(12.54);

        for(int i=0;i<al.size();i++)
        {
            Object ob = al.get(i);
            MultipleDataType m = new MultipleDataType(); 

            //if(ob instanceof String || ob instanceof Double || ob instanceof Integer)

            System.out.println("Value is "+ob);    
        }
	}
}
