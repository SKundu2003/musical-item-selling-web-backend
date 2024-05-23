package com.music_web.music.web.service;

import com.music_web.music.web.al.readAL.UserDetailReadAL;
import com.music_web.music.web.al.writeAL.OrderReadAL;
import com.music_web.music.web.al.writeAL.UserDetailWriteAL;
import com.music_web.music.web.al.writeAL.impl.UserDetailWriteALImpl;
import com.music_web.music.web.entity.MusicUserDetail;
import com.music_web.music.web.entity.OrderDetail;
import com.music_web.music.web.requests.CreateUserRequest;
import com.music_web.music.web.requests.PlaceOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderService {
    private final UserDetailWriteAL userDetailWriteAL;
    private final UserDetailReadAL userDetailReadAL;

    private final OrderReadAL orderReadAL;

    @Autowired
    public OrderService(UserDetailWriteAL userDetailWriteAL, UserDetailReadAL userDetailReadAL,
                        OrderReadAL orderReadAL) {
        this.orderReadAL = orderReadAL;
        this.userDetailWriteAL = userDetailWriteAL;
        this.userDetailReadAL = userDetailReadAL;
    }

    public Optional<MusicUserDetail> createUserDetail(CreateUserRequest createUserRequest) {

        Optional<MusicUserDetail> userDetailByEmail
                = userDetailReadAL.findUserDetailByEmail(createUserRequest.getEmail());
        if (userDetailByEmail.isPresent()) {
            return userDetailByEmail;
        }
        return userDetailWriteAL.createUserDetail(createUserRequest);
    }

    public Optional<OrderDetail> placeOrder(PlaceOrderRequest placeOrderRequest){
        return orderReadAL.placeOrder(placeOrderRequest);
    }
}
