package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Poll {
    private String id;
    private String question;
    private PollOption[] options;
    @JsonProperty("total_voter_count")
    private int totalVoterCount;
    @JsonProperty("is_closed")
    private boolean isClosed;
    @JsonProperty("is_anonymous")
    private boolean isAnonymous;
    private String type;
    @JsonProperty("allows_multiple_answers")
    private boolean allowsMultipleAnswers;
    @JsonProperty("correct_option_id")
    private int correctOptionId;
    private String explanation;
    @JsonProperty("explanation_entities")
    private MessageEntity[] explanationEntities;
    @JsonProperty("open_period")
    private int openPeriod;
    @JsonProperty("close_date")
    private int closeDate;
}
