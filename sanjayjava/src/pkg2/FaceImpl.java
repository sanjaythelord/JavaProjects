package pkg2;

public class FaceImpl implements Face1 {
	public void look() {
		System.out.println("You look Good.");
	}
	public int add(int a,int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		FaceImpl f = new FaceImpl();
		f.look();
		int v = f.add(12,4);
		System.out.println(v);
	}

}
