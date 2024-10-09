package pkg2;

public interface Company {
	public void detail(String name,int empId);
}
//can define multiple interface in the same file as below without public keyword.
//interface class can be made in another file and extend too.
interface Department extends Company{
	public void Deptdetail(String name, int empNum);
}

