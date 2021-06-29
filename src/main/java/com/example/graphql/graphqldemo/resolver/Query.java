package com.example.graphql.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.graphqldemo.pojo.Attendee;
import com.example.graphql.graphqldemo.pojo.Speaker;
import com.example.graphql.graphqldemo.pojo.Talk;
import com.example.graphql.graphqldemo.service.AttendeeService;
import com.example.graphql.graphqldemo.service.SpeakerService;
import com.example.graphql.graphqldemo.service.TalkService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Component
public class Query implements GraphQLQueryResolver {

    @Resource
    private  TalkService talkService;
    @Resource
    private  SpeakerService speakerService;
    @Resource
    private  AttendeeService attendeeService;


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
