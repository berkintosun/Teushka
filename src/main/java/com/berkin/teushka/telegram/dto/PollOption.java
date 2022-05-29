package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PollOption {
    private String text;
    @JsonProperty("voter_count")
    private int voterCount;
}
