package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    // ----- 仕様1 -----
    @GetMapping("/dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date) {
        LocalDate dayofweek =LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd"));
        DayOfWeek week1 = dayofweek.getDayOfWeek();
        String week2;
        switch (week1) {
            case SUNDAY:
                week2="Sunday";
                break;
            case MONDAY:
                week2="Monday";
                break;
            case TUESDAY:
                week2="Tuesday";
                break;
            case WEDNESDAY:
                week2="Wednesday";
                break;
            case THURSDAY:
                week2="Thursday";
                break;
            case FRIDAY:
                week2="Friday";
                break;
            case SATURDAY:
                week2="Saturday";
                break;
            default:
                week2="曜日取得失敗";
        }
        return week2.toString();
    }

    // ----- 仕様2 -----
    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res=0;
        res = val1 + val2;
        return res;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res=0;
        res = val1 - val2;
        return res;
    }
    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res=0;
        res = val1 * val2;
        return res;
    }
    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res=0;
        res = val1 / val2;
        return res;
    }
}