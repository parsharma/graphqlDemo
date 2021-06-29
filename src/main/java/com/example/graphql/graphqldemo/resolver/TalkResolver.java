package com.example.graphql.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.graphqldemo.pojo.Speaker;
import com.example.graphql.graphqldemo.pojo.Talk;
import com.example.graphql.graphqldemo.service.SpeakerService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class TalkResolver implements GraphQLResolver<Talk> {

    @Resource
    private  SpeakerService speakerService;

    public List<Speaker> speakers (Talk talk){
        return speakerService.findAllSpeakersForTalk(talk);
    }

}
