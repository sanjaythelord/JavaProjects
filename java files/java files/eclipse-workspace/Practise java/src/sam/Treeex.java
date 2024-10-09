package sam;

import java.util.TreeSet;

public class Treeex {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();//if String is removed and left empty than any type of data can be added....
	ts.add("Sanjay");//.....it is called generics
	ts.add("Sam");
	ts.add("Sameer");
	ts.add("Sanjay");
	System.out.println(ts);//sorted name list and duplicate data is removed
}
}
