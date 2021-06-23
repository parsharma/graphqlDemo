package com.example.graphql.graphqldemo.repository;

import com.example.graphql.graphqldemo.pojo.Talk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TalkRepository extends JpaRepository<Talk, Long> {
}
