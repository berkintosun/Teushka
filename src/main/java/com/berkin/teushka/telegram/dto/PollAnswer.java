package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PollAnswer {
    @JsonProperty("poll_id")
    private String pollId;
    private User user;
    @JsonProperty("option_ids")
    private int[] optionIds;
}
