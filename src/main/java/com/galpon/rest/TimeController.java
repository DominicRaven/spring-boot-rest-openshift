package com.galpon.rest;

import org.joda.time.LocalTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private static final String template = "The current local time is: %s!";

    @RequestMapping("/time")
    public String time() {
        return String.format(template, getCurrentTime());
    }
    
    private String getCurrentTime() {
    	LocalTime currentTime = new LocalTime();
    	return currentTime.toString();
    }
    
}