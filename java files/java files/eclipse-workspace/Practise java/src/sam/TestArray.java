package sam;

public class TestArray {
	public void getArrayVal(String arr[])
	{  for(int i=0;i<arr.length;i++) {//assigning array length
		System.out.println(arr[i]);
	}
	}
public static void main(String[] args) {
	TestArray t=new TestArray();
	String[] name=new String[2];
	name[0]="Sanjay";
	name[1]="shah";
		t.getArrayVal(name);//calling String array
}
}
