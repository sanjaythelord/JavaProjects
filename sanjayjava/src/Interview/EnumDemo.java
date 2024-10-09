package Interview;

//enum showing Mobile prices
enum Mobile {
Samsung(400), Nokia(250),Motorola(325);

int price;
Mobile(int p) {
   price = p;
  }
int showPrice() {
   return price;
  } 
}

public class EnumDemo {
	 public static void main(String args[]) {
		   
	      System.out.println("CellPhone List:");
	      for(Mobile m : Mobile.values()) { 
	         System.out.println(m + " costs " + m.showPrice() + " dollars");
	      }

	      Mobile name;
	      name = Mobile.valueOf("Nokia"); 
	      System.out.println("Selected : " + name.showPrice() );                              
	   }
}
