package com.cos.livechar.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    private String message;
    private String fromLogin;

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", fromLogin='" + fromLogin + '\'' +
                '}';
    }
}
