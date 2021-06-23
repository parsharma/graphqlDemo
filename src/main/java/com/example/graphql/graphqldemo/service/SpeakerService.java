package com.example.graphql.graphqldemo.service;

import com.example.graphql.graphqldemo.pojo.Speaker;
import com.example.graphql.graphqldemo.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository;

    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }
}
