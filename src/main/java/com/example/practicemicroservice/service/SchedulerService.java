package com.example.practicemicroservice.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    @Scheduled(cron = "0 33 14 3 9 ?")
    public String printhello(){
        System.out.println("hello");
        return "hello";
    }
}