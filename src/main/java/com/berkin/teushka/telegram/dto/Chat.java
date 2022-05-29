package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Chat {
    private int id;
    private String type;
    private String title;
    private String username;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    //private ChatPhoto photo;
    private String bio;
    @JsonProperty("has_private_forwards")
    private Boolean hasPrivateForwards;
    private String description;
    @JsonProperty("invite_lint")
    private String inviteLink;
    @JsonProperty("pinned_message")
    private Message pinnedMessage;
    private ChatPermissions permissions;
    @JsonProperty("slow_mode_delay")
    private int slowModeDelay;
    @JsonProperty("message_auto_delete_time")
    private int messageAutoDeleteTime;
    @JsonProperty("has_protected_content")
    private Boolean hasProtectedContent;
    @JsonProperty("sticker_set_name")
    private String stickerSetName;
    @JsonProperty("can_set_sticker_set")
    private Boolean canSetStickerSet;
    @JsonProperty("linked_chat_id")
    private int linkedChatId;
    private ChatLocation location;

}
