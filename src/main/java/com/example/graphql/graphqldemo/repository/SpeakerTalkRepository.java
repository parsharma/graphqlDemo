package com.example.graphql.graphqldemo.repository;

import com.example.graphql.graphqldemo.pojo.Speaker;
import com.example.graphql.graphqldemo.pojo.SpeakerTalk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpeakerTalkRepository extends JpaRepository<SpeakerTalk, Long> {

    List<SpeakerTalk> findAllBySpeakerId(Long speakerId);
    List<SpeakerTalk> findAllByTalkId(Long talkId);

}
