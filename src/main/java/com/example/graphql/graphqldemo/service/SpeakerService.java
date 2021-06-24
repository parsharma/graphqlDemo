package com.example.graphql.graphqldemo.service;

import com.example.graphql.graphqldemo.pojo.Speaker;
import com.example.graphql.graphqldemo.pojo.SpeakerTalk;
import com.example.graphql.graphqldemo.pojo.Talk;
import com.example.graphql.graphqldemo.repository.SpeakerRepository;
import com.example.graphql.graphqldemo.repository.SpeakerTalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository;

    @Autowired
    private SpeakerTalkRepository speakerTalkRepository;

    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }
    public List<Speaker> findAllSpeakersForTalk(Talk talk){
        //List<Optional<Speaker>> temp = null;
        List<SpeakerTalk> speakersTalk = speakerTalkRepository.findAllByTalkId(talk.getId());
        /*for(SpeakerTalk st: speakersTalk){
            temp.add(speakerRepository.findById(st.getSpeakerId()));

        }*/
        return speakersTalk.stream()
                .map(e -> speakerRepository.findById(e.getSpeakerId()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}
