package sam;

public class Mdarray {
public static void main(String[] args) {
	int[][] multi=new int[3][3];
	multi[0][0]=10;
	multi[0][1]=12;
	multi[0][2]=11;
	multi[1][0]=97;
	multi[1][1]=18;
	multi[1][2]=19;
	multi[2][0]=70;
	multi[2][1]=45;
	multi[2][2]=16;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++)
		{
			System.out.print(multi[i][j] +" ");//only print not println
		}
		System.out.println(" ");
	}
	
}
}
