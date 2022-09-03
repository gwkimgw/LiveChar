package com.cos.livechar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
    @RequestMapping("/chat/room")
    public String showRoom(int roomId) {
        return "chat/room";
    }
}