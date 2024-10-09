package sam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DTAPI {
public static void main(String[] args) {
	LocalDate ld=LocalDate.now();
	System.out.println(ld);
	LocalTime lt=LocalTime.now();
	System.out.println(lt);
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println(ldt);
	String formatDate=ldt.format(DateTimeFormatter.ofPattern("yyyy-mm-dd"));
	System.out.println("FormatDate: "+formatDate);
	String formatTime=ldt.format(DateTimeFormatter.ofPattern("hh-mm-ss"));
	System.out.println("FormatTime: "+formatTime);
}
}
