package com.music_web.music.web.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class OrderDetail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("item_name")
    private String itemName;

    @JsonProperty("item_price")
    private Long itemPrice;

    @JsonProperty("item_qty")
    private Long itemQty;

}
