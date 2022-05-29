package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderInfo {
    private String name;
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String email;
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
}
