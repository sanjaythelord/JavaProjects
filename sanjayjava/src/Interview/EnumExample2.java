package Interview;

enum Shape {
	 SMALL, MEDIUM, LARGE, EXTRALARGE
	}

	class Test {
	 Shape pizzaSize;
	 public Test(Shape pizzaSize) {
	   this.pizzaSize = pizzaSize;
	 }
	 public void orderPizza() {
	   switch(pizzaSize) {
	     case SMALL:
	       System.out.println("I ordered a small size pizza.");
	       break;
	     case MEDIUM:
	       System.out.println("I ordered a medium size pizza.");
	       break;
	     default:
	       System.out.println("I don't know which one to order.");
	       break;
	   }
	 }
	}

	class EnumExample2 {
	 public static void main(String[] args) {
	   Test t1 = new Test(Shape.MEDIUM);
	   t1.orderPizza();
	 }
	}