package com.example.graphql.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.graphqldemo.pojo.Attendee;
import com.example.graphql.graphqldemo.pojo.Speaker;
import com.example.graphql.graphqldemo.pojo.Talk;
import com.example.graphql.graphqldemo.service.AttendeeService;
import com.example.graphql.graphqldemo.service.SpeakerService;
import com.example.graphql.graphqldemo.service.TalkService;

import java.util.List;


public class Query implements GraphQLQueryResolver {

    private final TalkService talkService;
    private final SpeakerService speakerService;
    private final AttendeeService attendeeService;

    public Query(TalkService talkService, SpeakerService speakerService, AttendeeService attendeeService) {
        this.talkService = talkService;
        this.speakerService = speakerService;
        this.attendeeService = attendeeService;
    }

    public List<Talk> allTalks() {
        return talkService.findAll();
    }

    public List<Attendee> allAttendees() {
        return attendeeService.findAll();
    }

    public List<Speaker> allSpeakers() {
        return speakerService.findAll();
    }
}
