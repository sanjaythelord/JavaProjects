package Assignment;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java ");  
		sb.append("Technology");
		System.out.println("1. Using append:"+sb);
		
		StringBuilder sb1 = new StringBuilder("Death ");  
		sb1.insert(4,"Star");
		System.out.println("2. Using insert:"+sb1);
		
		StringBuilder sb2 = new StringBuilder("Hello ");  
		sb2.replace(1,3,"Java");  
		System.out.println("3. Using replace:"+sb2);
		
		sb2.delete(1,2);  
		System.out.println("4. Using delete:"+sb2);
		
		sb2.reverse();  
		System.out.println("5. Using reverse:"+sb2);
		
		System.out.println(sb.capacity());//default 16 
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
	}

}
