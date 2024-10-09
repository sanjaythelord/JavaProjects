package state;

import country.MyCountry;
public class MyState extends MyCountry{//inherit from parent class MyCountry
int stateno;//default access modifier
public static void main(String[] args) {
	MyCountry c = new MyCountry();
	MyState s = new MyState();
	s.cap();//public
	s.cont();//protected
	//cannot be accessed through object c for protected
	//default i.e.code and private i.e.countryname cannot be accessed in other package
	//System.out.println("Capital is:"+x);
	//System.out.println("Continent is:"+y);
}
}
