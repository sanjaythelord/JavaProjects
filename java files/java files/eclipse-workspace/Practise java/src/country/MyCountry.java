package country;

public class MyCountry {
private String countryname="Nepal";
int code=1;//default access modifier
protected String continent="Asia";
public String capital="Kathmandu";
public void cap() {
	System.out.println("Capital is:"+capital);
}
protected void cont() {
	System.out.println("Continent is:"+continent);
}
private void name() {
	System.out.println("Country is:"+countryname);	
}
void cod() {
	System.out.println("Code is:"+code);
}
}
