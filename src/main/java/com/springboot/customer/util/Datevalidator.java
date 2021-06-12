package com.springboot.customer.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Datevalidator {
	public static boolean isValidDate(String format, String value, Locale locale) {
       
        DateTimeFormatter fomatter = DateTimeFormatter.ofPattern(format, locale);

        try {
        	 LocalDate ld = LocalDate.parse(value, fomatter);
             String result = ld.format(fomatter);
             return result.equals(value);
        } catch (DateTimeParseException e) {
           e.printStackTrace();
           return false;
            }
    }

}
