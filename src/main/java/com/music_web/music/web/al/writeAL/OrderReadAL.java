package com.music_web.music.web.al.writeAL;

import com.music_web.music.web.entity.OrderDetail;
import com.music_web.music.web.requests.PlaceOrderRequest;

import java.util.Optional;

public interface OrderReadAL {

    Optional<OrderDetail> placeOrder(PlaceOrderRequest placeOrderRequest);
}
