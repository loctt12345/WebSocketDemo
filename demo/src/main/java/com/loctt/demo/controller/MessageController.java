/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loctt.demo.controller;

/**
 *
 * @author loc12345
 */
import com.loctt.demo.dto.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    // Handles messages from /app/chat. (Note the Spring adds the /app prefix for us).
    @MessageMapping("/chat")
    // Sends the return value of this method to /topic/messages
    @SendTo("/topic/messages")
    public Message getMessages(Message dto){
    
        return dto;
    
    }

}
