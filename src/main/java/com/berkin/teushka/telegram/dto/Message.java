package com.berkin.teushka.telegram.dto;

import lombok.Data;

@Data
public class Message {
    private int messageId;
    private User from;
}
