package com.music_web.music.web.al.writeAL.impl;

import com.music_web.music.web.al.writeAL.UserDetailWriteAL;
import com.music_web.music.web.entity.MusicUserDetail;
import com.music_web.music.web.repositories.MusicUserDetailRepository;
import com.music_web.music.web.requests.CreateUserRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDetailWriteALImpl implements UserDetailWriteAL {

    private final MusicUserDetailRepository musicUserDetailRepository;

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    @Autowired
    public UserDetailWriteALImpl(MusicUserDetailRepository musicUserDetailRepository) {
        this.musicUserDetailRepository = musicUserDetailRepository;
    }

    @Override
    public Optional<MusicUserDetail> createUserDetail(CreateUserRequest createUserRequest) {
        return Optional.of(musicUserDetailRepository.save(MODEL_MAPPER.map(createUserRequest, MusicUserDetail.class)));
    }
}
