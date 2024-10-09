package sam;

public class Array {
public static void main(String[] args) {
	int[] num=new int[5];
	String[] fruits=new String[3];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	fruits[0]="apple";
	fruits[1]="mango";
	fruits[2]="banana";
	for(int j=0;j<3;j++) {
		System.out.println(fruits[j]);
	}
	int sum=0;
	for(int i=0;i<5;i++) {
	sum+=num[i];
	}
	System.out.println(+sum);
	
}
}
