package Assignment;

//Employee POJO class to represent entity Employee

public class Employee {

	// default field
    String name;
    // public field
    public String id;
    // private salary
    private double salary;
    //argument-constructor to initialize fields
    public Employee(String name, String id,
                             double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
 
    // getter method for name
    public String getName()
    {
        return name;
    }
 
    // getter method for id
    public String getId()
    {
        return id;
    }
 
    // getter method for salary
    public Double getSalary()
    {
        return salary;
    }
}


//The above example is a well-defined example of the POJO class.
//As you can see, there is no restriction on access-modifiers of fields.
//They can be private, default, protected, or the public.
//It is also not necessary to include any constructor in it.
//POJO is an object which encapsulates Business Logic.
