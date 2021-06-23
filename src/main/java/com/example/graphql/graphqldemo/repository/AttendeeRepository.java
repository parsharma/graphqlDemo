package com.example.graphql.graphqldemo.repository;

import com.example.graphql.graphqldemo.pojo.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}
