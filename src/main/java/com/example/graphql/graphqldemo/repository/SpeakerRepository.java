package com.example.graphql.graphqldemo.repository;

import com.example.graphql.graphqldemo.pojo.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
