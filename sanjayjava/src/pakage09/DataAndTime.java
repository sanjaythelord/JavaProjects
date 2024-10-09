package pakage09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataAndTime {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		//formatting date and time
		//try for following
		//("YYY/MMM/dd")
		//("YYY/MMM/DD")
		String df = ldt.format(DateTimeFormatter.ofPattern("YYY/MM/dd"));
		System.out.println(df);
		String lf = ldt.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
		System.out.println(lf);
	}
}
