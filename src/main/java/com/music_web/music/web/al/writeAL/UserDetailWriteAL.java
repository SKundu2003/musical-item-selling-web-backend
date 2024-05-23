package com.music_web.music.web.al.writeAL;

import com.music_web.music.web.entity.MusicUserDetail;
import com.music_web.music.web.requests.CreateUserRequest;

import java.util.Optional;

public interface UserDetailWriteAL {

    Optional<MusicUserDetail> createUserDetail(CreateUserRequest createUserRequest);
}
