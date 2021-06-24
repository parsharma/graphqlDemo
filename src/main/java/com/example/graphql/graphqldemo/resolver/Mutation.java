package com.example.graphql.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.graphqldemo.pojo.Speaker;
import com.example.graphql.graphqldemo.pojo.SpeakerInput;
import com.example.graphql.graphqldemo.service.SpeakerService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    private final SpeakerService speakerService;

    public Speaker addSpeaker(SpeakerInput speakerInput) {
        Speaker speaker = new Speaker();
        speaker.setName(speakerInput.getName());
        speaker.setTwitter(speakerInput.getTwitter());
        return speakerService.save(speaker);
    }
}
