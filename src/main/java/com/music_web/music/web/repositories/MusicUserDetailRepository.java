package com.music_web.music.web.repositories;

import com.music_web.music.web.entity.MusicUserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MusicUserDetailRepository extends JpaRepository<MusicUserDetail, Long> {

    Optional<MusicUserDetail> findByEmail(String email);
}
