package pakage09;

/*Synchronization in java is the capability to control the access
of multiple threads to any shared resource. 
In the Multi-threading concept, multiple threads 
try to access the shared resources at a time to produce inconsistent results.
The synchronization is necessary for reliable communication between threads.*/

//synchronization is used:
// 1. to prevent thread interference
// 2. to prevent consistency problem

public class SynchronizationExample{
//remove synchronized and see output at TestSynchronization.
//with synchronized keyword the execution is organized.
	   synchronized void printTable(int n) {
	    //void printTable(int n) {
		 for(int i=1;i<=10;i++){  
		     System.out.println(n+"*"+i+"="+(n*i));  
		     try{  
		      Thread.sleep(100);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
	}
	
	/*
	 * public static void main(String[] args) { SynchronizationExample s =new
	 * SynchronizationExample(); s.printTable(4); // s.printTable(6); }
	 */
	
}
