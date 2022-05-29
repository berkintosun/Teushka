package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatJoinRequest {
    private Chat chat;
    private User from;
    private int date;
    private String bio;
    @JsonProperty("invite_link")
    private ChatInviteLink inviteLink;
}
