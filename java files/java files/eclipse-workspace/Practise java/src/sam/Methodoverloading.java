package sam;

public class Methodoverloading {
	static int s=0;
void method(int x,int y) {
	//int s=0;
	s=x+y;
	System.out.println("Sum is:"+s);
}
void method(int x,int y,int z) {
	//int s=0;
	s=x+y+z;
	System.out.println("Sum is:"+s);
}
void method(int x) {
	//int s=0;
	s=x;
	System.out.println("Sum is:"+s);
}
public static void main(String[] args) {
	Methodoverloading m=new Methodoverloading();
	m.method(2,6);
	m.method(4);
	m.method(2,6,8);
}
}
