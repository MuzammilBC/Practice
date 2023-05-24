package com.rakuten.ems.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateDemp {

	public static void main(String[] args) {
    
		LocalDate id=LocalDate.now();
		
		System.out.println(id);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd/MM/yy");
		String formatteddate=id.format(pattern);
		System.out.println(formatteddate);
		
		//to get the day of the week(Monday/Tuesday...)
		System.out.println(id.getDayOfWeek());
		
		System.out.println(id.getDayOfMonth());
		
		System.out.println(id.getDayOfYear());
		
		
		System.out.println(id.getMonth());
		
		System.out.println(id.getMonthValue());
		
		LocalDate Muzammil_bdy=LocalDate.of(1995, 9,14 );
		
		System.out.println("Muzammil Birthday is :"+Muzammil_bdy);
		
		System.out.println("Muzammil Birthday is :"+Muzammil_bdy.getDayOfWeek());
		
		LocalDate ValentainsDay=LocalDate.of(2023,2, 14);
		System.out.println(ValentainsDay.isAfter(Muzammil_bdy));
		System.out.println(Muzammil_bdy.isAfter(ValentainsDay));
		
		
		//Date Differences
		Period p=Period.between(Muzammil_bdy, ValentainsDay);
		System.out.println("number of days betweeen Muzammil Birthday and valaentaince day :" 
		+p.getYears()+"years"+p.getMonths()+"Month(s)"+p.getDays()+"days(s)");
	}

}
