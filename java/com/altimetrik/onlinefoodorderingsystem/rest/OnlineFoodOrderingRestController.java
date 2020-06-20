package com.altimetrik.onlinefoodorderingsystem.rest;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.onlinefoodorderingsystem.domain.Restaurant;
import com.altimetrik.onlinefoodorderingsystem.domain.RestaurantRepository;

@RestController
public class OnlineFoodOrderingRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

}
