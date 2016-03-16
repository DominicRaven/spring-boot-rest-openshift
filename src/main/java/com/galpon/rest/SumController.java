package com.galpon.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    private static final String template = "%s + %s = %s";

    @RequestMapping("/sum")
    public String sum(@RequestParam(value="a", defaultValue="0") int a, 
    		                 @RequestParam(value="b", defaultValue="0") int b) {
    	return String.format(template, a, b, a+b);
    }
}