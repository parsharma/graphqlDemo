package com.example.graphql.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.graphqldemo.pojo.Talk;
import com.example.graphql.graphqldemo.service.TalkService;

import java.util.List;


public class Query implements GraphQLQueryResolver {

    private final TalkService talkService;

    public Query(TalkService talkService) {
        this.talkService = talkService;
    }

    public List<Talk> allTalks(){
        return talkService.findAll();
    }
}
