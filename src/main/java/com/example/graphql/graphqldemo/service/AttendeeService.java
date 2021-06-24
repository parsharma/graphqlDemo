package com.example.graphql.graphqldemo.service;

import com.example.graphql.graphqldemo.pojo.Attendee;
import com.example.graphql.graphqldemo.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeeService {

    @Autowired
    private AttendeeRepository attendeeRepository;

    public List<Attendee> findAll(){
        return attendeeRepository.findAll();
    }

    public Attendee save(Attendee attendee){
        return attendeeRepository.save(attendee);
    }
}
