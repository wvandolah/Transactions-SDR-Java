package com.costshare.transactions.service;

import org.springframework.stereotype.Service;

@Service
//@EnableBinding(Sink.class)
public class PersonConsumer {
//    @StreamListener(target = Sink.INPUT)
    public void processCheapMeals(String meal){
        System.out.println("this was a great meal!: "+meal);
    }
}
