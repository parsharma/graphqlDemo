package com.example.graphql.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.graphqldemo.pojo.Speaker;
import com.example.graphql.graphqldemo.pojo.SpeakerInput;
import com.example.graphql.graphqldemo.service.SpeakerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Resource
    private  SpeakerService speakerService;

    public Speaker addSpeaker(SpeakerInput speakerInput) {
        Speaker speaker = new Speaker();
        speaker.setName(speakerInput.getName());
        speaker.setTwitter(speakerInput.getTwitter());
        return speakerService.save(speaker);
    }
}
