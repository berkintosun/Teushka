package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Message {
    @JsonProperty("message_id")
    private int messageId;
    private User from;
    @JsonProperty("sender_chat")
    private Chat senderChat;
    private String text;
}
