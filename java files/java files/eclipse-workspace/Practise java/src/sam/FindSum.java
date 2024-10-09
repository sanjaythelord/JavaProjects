package sam;

import java.util.ArrayList;
public class FindSum {
	ArrayList<Sum> function(){
		ArrayList<Sum> al=new ArrayList<Sum>();
		Sum s1=new Sum(25,34);
		al.add(s1);
		return al;
	}
public static void main(String[] args) {
	FindSum fs=new FindSum();
	ArrayList<Sum> x=fs.function();
	for(Sum s:x) {
		System.out.println("num: "+s.getNum()+" val: "+s.getVal());
	
}
}
}
