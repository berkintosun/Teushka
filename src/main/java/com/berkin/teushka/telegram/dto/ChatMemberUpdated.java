package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatMemberUpdated extends ChatMember {
    private Chat chat;
    private User from;
    private int date;
    @JsonProperty("old_chat_member")
    private ChatMember oldChatMember;
    @JsonProperty("new_chat_member")
    private ChatMember newChatMember;
    @JsonProperty("invite_link")
    private ChatInviteLink inviteLink;
}
