package com.music_web.music.web.al.writeAL.impl;

import com.music_web.music.web.al.writeAL.OrderReadAL;
import com.music_web.music.web.entity.OrderDetail;
import com.music_web.music.web.repositories.OrderDetailRepository;
import com.music_web.music.web.requests.PlaceOrderRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderReadALImpl implements OrderReadAL {

    private final ModelMapper MODEL_MAPPER = new ModelMapper();

    private final OrderDetailRepository orderDetailRepository;

    @Autowired
    public OrderReadALImpl(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;

    }


    @Override
    public Optional<OrderDetail> placeOrder(PlaceOrderRequest placeOrderRequest) {
        OrderDetail map = MODEL_MAPPER.map(placeOrderRequest, OrderDetail.class);

        return Optional.of(orderDetailRepository.save(map));
    }
}
