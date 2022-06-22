package com.example.UhrzeitundDatum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

@RestController
public class Methoden {

    @GetMapping("api/time")
    public LocalTime GetLocalTime() {
        LocalTime time = LocalTime.now();
        return time;
    }

    @GetMapping("api/date")
    public static LocalDate LocalDateTimeApi() {
        LocalDate date = LocalDate.now();
        return date;
    }

    @GetMapping("api/date/format=yyyy-MM-dd")
    public static LocalDate format1() {
        LocalDate date = LocalDate.now();
        return date;
    }

    @GetMapping("api/date/format=dd/MM/yyyy")
    public static String format2(){
        Date date = Calendar.getInstance().getTime();
        // Display a date in day, month, year format
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(date);
        return today;
    }


}