package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Location {
    private float longitude;
    private float latitude;
    @JsonProperty("horizontal_accuracy")
    private float horizontalAccuracy;
    @JsonProperty("live_period")
    private int livePeriod;
    private int heading;
    @JsonProperty("proximity_alert_radius")
    private int proximityAlertRadius;
}
