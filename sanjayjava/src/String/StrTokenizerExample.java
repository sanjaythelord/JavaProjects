package String;

import java.util.StringTokenizer;

public class StrTokenizerExample {
	
	public static void main(String[] args) {

	StringTokenizer st = new StringTokenizer("Hello everyone I am a Java developer"); 
	System.out.println(st);
    while (st.hasMoreElements())   
    {    
        System.out.println(st.nextElement());    
    } 
  }
}
