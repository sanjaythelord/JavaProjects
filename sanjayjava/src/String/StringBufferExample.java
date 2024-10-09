package String;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Star ");  
		StringBuffer sb1=new StringBuffer("DeathStar");
		sb.append("Wars"); 
		System.out.println("1. Append: "+sb);
		
		sb.insert(1,"apple");
		System.out.println("2. Insert: "+sb);
		
		sb.replace(1,3,"DeathStar"); 
		System.out.println("3. Replace: "+sb);
		
		sb1.delete(1,3);  
		System.out.println("4. Delete: "+sb1);
		
		sb1.reverse(); 
		System.out.println("5. Reverse: "+sb1);
	}

}
