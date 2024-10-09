package FileHandling;

import java.io.FileOutputStream;  
public class FileOutputStreamExample2 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("F:\\KnK College\\JAVA\\file.txt");    
             String s="Welcome to java class.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
} 