package dev.naimsulejmani.locationservicegr1.controllers;

import dev.naimsulejmani.locationservicegr1.dtos.MessageModel;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class ChatController {
    private final SimpMessagingTemplate messagingTemplate;

    public ChatController(SimpMessagingTemplate simpMessagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public MessageModel sendMessage(@Payload MessageModel model) {
        return model;
    }

        @MessageMapping("/text")
    public void processMessage(@Payload MessageModel message) {
        messagingTemplate.convertAndSendToUser(message.getFrom(), "/queue/texes", message);
//        messagingTemplate.send("/topic/messages", new Message<MessageModel>() {
//            @Override
//            public MessageModel getPayload() {
//                return null;
//            }
//
//            @Override
//            public MessageHeaders getHeaders() {
//                return null;
//            }
//        });
        // recipient should be a username or a unique identifier for the target user
    }

}





