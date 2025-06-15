package com.example.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.example.chat.model.ChatMessage;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ChatController {

    // This controller handles chat messages.
    // Handles incoming chat messages and broadcasts them.
    @MessageMapping("/sendMessage")
    @SendTo("topic/messages")
    public ChatMessage sendmessage(ChatMessage message){
        return message;
    }
    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}
