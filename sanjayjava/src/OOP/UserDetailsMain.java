package OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;

public class UserDetailsMain {
	
	public boolean age(int d) throws Mustbegreaterthan18 {
		if(d<18) {
			throw new Mustbegreaterthan18("Age not valid");
		}
		return false;
	}

	public static void main(String[] args) {
		
		/*
		 * SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 * Date date = new Date();
		 */
	    //System.out.println(formatter.format(date));
		UserDetailsMain u = new UserDetailsMain();
		UserDetails ud = new UserDetails();
		ud.setUserName("Sanjay");
		ud.setPassword("123");
		ud.setStatus(true);
		ud.setDob(2010);
		//ud.setDateofbirth(date);
		System.out.println("UserName: "+ud.getUserName());
		System.out.println("Password: "+ud.getPassword());
		System.out.println("Status: "+ud.getStatus());
		System.out.println("DOB: "+ud.getDob());
		int x = ud.getDob();
		System.out.println(x);
		int d = (2021-x);
		try {
			u.age(d);
		} catch (Mustbegreaterthan18 e) {
			e.printStackTrace();
		}
		
		
		/*
		 * if((2021-(ud.getDob())<18)) { throw new Mustbegreaterthan18("Age not valid");
		 * }
		 */
		

	}

}
