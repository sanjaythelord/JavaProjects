package FileHandling; 
    import java.io.FileInputStream;  
    public class DataStreamExample {  
         public static void main(String args[]){    
              try{    
                FileInputStream f=new FileInputStream("F:\\College\\JAVA\\file.txt");    
                int i=0;
                //why i=f.read())!=-1
                //That means you would continue reading from the stream until
                //you reached the end. When f.read() returns -1, 
                //that means that you reached the end of the stream and
                //there is no more data to read.
                while((i=f.read())!=-1){    
                 System.out.print((char)i);
                 //System.out.print(i); 
                }    
                f.close();    
                
              }catch(Exception e){
            	  System.out.println(e);
            	  }    
             }    
            }  
