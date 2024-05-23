package com.music_web.music.web.al.readAL;

import com.music_web.music.web.entity.MusicUserDetail;

import java.util.Optional;

public interface UserDetailReadAL {

    Optional<MusicUserDetail> findUserDetailByEmail(String email);
}
