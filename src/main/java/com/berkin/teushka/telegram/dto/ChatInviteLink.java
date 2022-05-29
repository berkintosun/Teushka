package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatInviteLink {
    @JsonProperty("invite_link")
    private String inviteLink;
    private User creator;
    @JsonProperty("creates_json_request")
    private boolean createsJsonRequest;
    @JsonProperty("is_primary")
    private boolean isPrimary;
    @JsonProperty("is_revoked")
    private boolean isRevoked;
    private String name;
    @JsonProperty("expire_date")
    private int expireDate;
    @JsonProperty("member_limit")
    private int memberLimit;
    @JsonProperty("pendind_join_request_count")
    private int pendingJoinRequestCount;
}
