package com.music_web.music.web.al.readAL.impl;

import com.music_web.music.web.al.readAL.UserDetailReadAL;
import com.music_web.music.web.entity.MusicUserDetail;
import com.music_web.music.web.repositories.MusicUserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDetailReadALImpl implements UserDetailReadAL {

    private final MusicUserDetailRepository musicUserDetailRepository;

    @Autowired
    public UserDetailReadALImpl(MusicUserDetailRepository musicUserDetailRepository) {
        this.musicUserDetailRepository = musicUserDetailRepository;
    }

    @Override
    public Optional<MusicUserDetail> findUserDetailByEmail(String email) {
        return musicUserDetailRepository.findByEmail(email);
    }


}
