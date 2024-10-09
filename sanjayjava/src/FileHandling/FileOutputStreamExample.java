package FileHandling;
import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("F:\\KnK College\\JAVA\\file.txt");    
             fout.write(65); 
           // fout.write("hello");
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
} 
