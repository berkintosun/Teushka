package com.berkin.teushka.telegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PreCheckoutQuery {
    private String id;
    private User from;
    private String currency;
    @JsonProperty("total_amount")
    private int totalAmount;
    @JsonProperty("invoice_payload")
    private String invoicePayload;
    @JsonProperty("shipping_option_id")
    private String shippingOptionId;
    @JsonProperty("order_info")
    private OrderInfo orderInfo;
}
