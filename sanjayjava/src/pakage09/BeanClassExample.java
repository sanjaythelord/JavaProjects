package pakage09;
// A JavaBean is a "Java class" which at least minimally conforms to the JavaBean Specification.
//java program for javaBean class used private protected/ POJO class
//class that uses this bean class is Test.java
import java.io.Serializable;
public class BeanClassExample implements Serializable{
	//example student
	private int id;
	private String name;
	//constructor
	
	//  public BeanClassExample() { }
	 
	public void setId(int id)
	    {
	        this.id = id;
	    }
	public int getId()
	    {
	        return id;
	    }
	public void setName(String name)
	    {
	        this.name = name;
	    }
	public String getName()
	    {
	        return name;
	    }
}
