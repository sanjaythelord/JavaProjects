package ThirdSem;

public class CityDetail implements City,City2{
	@Override
	public void movieHall(String movie) {
		System.out.println("Movie name is: "+movie);
		
	}

	@Override
	public void mayor(String name) {
		System.out.println("Mayor name is: "+name);
		
	}

	@Override
	public void market(String name) {
		System.out.println("Market name is :"+name);
		
	}
	
	public static void main(String[] args) {
		CityDetail cd = new CityDetail();
		cd.movieHall("Matrix");
		cd.mayor("Balen");
		cd.market("Baneshwor");
	}

}
