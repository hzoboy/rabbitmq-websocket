package com.cictec.stomp.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :zoboy
 * @Description:
 * @ Date: Created in 2018-10-25 09:52
 */
@RestController
public class ProducerMessage {


    @Autowired
    private AmqpTemplate template;

    @GetMapping("/send/{message}")
    public String send(@PathVariable String message){
        template.convertAndSend("exchange","test",message);
        return "success";
    }
}
