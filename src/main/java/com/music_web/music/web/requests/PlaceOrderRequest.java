package com.music_web.music.web.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaceOrderRequest {
    private String itemName;

    private Long itemPrice;

    private Long itemQty;

    private Long userId;

}
