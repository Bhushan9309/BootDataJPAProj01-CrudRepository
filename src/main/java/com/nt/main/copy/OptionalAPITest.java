package com.nt.main.copy;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalAPITest {
      public Optional<LocalDate> showDate(int year, int month, int day) {
    	  if(year<0 || month<0 || day<0 )
    		  return Optional.empty();
    	  else
    	   return Optional.of(LocalDate.of(year, month, day));
      }
	public static void main(String[] args) {
		OptionalAPITest test = new OptionalAPITest();
		Optional<LocalDate> opt = test.showDate(2020, 10, 20);
		if(opt.isPresent())
			System.out.println("Date is ==> "+opt.get());
		else
			System.out.println("Wrong Inputs");

	}

}
