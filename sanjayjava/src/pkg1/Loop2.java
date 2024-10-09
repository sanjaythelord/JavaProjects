package pkg1;

//jumps in a loop
//out of loop control with break and continue 
public class Loop2 {
	void block()
	{
		for(int i=0;i<10;i++)
		{
			if(i==6) {
				//System.out.println(i);
				//break;
				continue;
			}
			System.out.println("Statement out of if block." +i);
		}
	}

	public static void main(String[] args) {
		Loop2 l = new Loop2();
		l.block();
	}
}
