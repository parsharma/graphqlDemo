package com.example.graphql.graphqldemo.service;

import com.example.graphql.graphqldemo.pojo.Talk;
import com.example.graphql.graphqldemo.repository.TalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalkService {

    @Autowired
    private TalkRepository talkRepository;

    public List<Talk> findAll(){
        return talkRepository.findAll();
    }

    public Talk save(Talk talk){
        return talkRepository.save(talk);
    }
}
