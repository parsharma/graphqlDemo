package com.example.graphql.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.graphqldemo.pojo.Speaker;
import com.example.graphql.graphqldemo.pojo.Talk;
import com.example.graphql.graphqldemo.service.SpeakerService;

import java.util.List;

public class TalkResolver implements GraphQLResolver<Talk> {

    private final SpeakerService speakerService;

    public TalkResolver(SpeakerService speakerService) {
        this.speakerService = speakerService;
    }

    public List<Speaker> speakers (Talk talk){
        return speakerService.findAllSpeakersForTalk(talk);
    }

}
