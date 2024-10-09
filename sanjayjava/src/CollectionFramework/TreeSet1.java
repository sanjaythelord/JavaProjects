package CollectionFramework;
//Java TreeSet class implements the Set interface that uses a tree for storage.
//The objects of the TreeSet class are stored in ascending order.
//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quiet fast.
//Java TreeSet class doesn't allow null element.
import java.util.*;  
class TreeSet1{  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay"); 
  //al.add(null);
  //al.add("");
  
  //Traversing elements 
  //Java Iterator is an interface that is practiced in order to iterate over
  //a collection of Java object components entirety one by one. 
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}