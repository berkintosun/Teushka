package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ShippingQuery {
    private String id;
    private User from;
    @JsonProperty("invoice_payload")
    private String invoicePayload;
    @JsonProperty("shipping_Address")
    private ShippingAddress shippingAddress;
}
