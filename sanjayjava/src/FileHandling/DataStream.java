package FileHandling;

import java.io.FileInputStream;

public class DataStream {

	public static void main(String args[]){ try{
		 FileInputStream f=new FileInputStream("F:\\College\\JAVA\\file.txt"); 
		 int i=f.read();
		 System.out.println((char)i);
		 System.out.println(i);
		 f.close(); 
		 }catch(Exception e){
			 System.out.println(e);
			 }
		 }
}
