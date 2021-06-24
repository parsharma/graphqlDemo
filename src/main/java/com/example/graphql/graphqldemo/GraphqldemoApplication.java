package com.example.graphql.graphqldemo;

import com.example.graphql.graphqldemo.resolver.Mutation;
import com.example.graphql.graphqldemo.resolver.Query;
import com.example.graphql.graphqldemo.resolver.TalkResolver;
import com.example.graphql.graphqldemo.service.AttendeeService;
import com.example.graphql.graphqldemo.service.SpeakerService;
import com.example.graphql.graphqldemo.service.TalkService;
import graphql.schema.GraphQLSchema;
import com.coxautodev.graphql.tools.SchemaParser;
import graphql.servlet.SimpleGraphQLHttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqldemoApplication {

	@Autowired
	private SpeakerService speakerService;

	@Autowired
	private TalkService talkService;

	@Autowired
	private AttendeeService attendeeService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqldemoApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean graphQLServlet() {
		return new ServletRegistrationBean(SimpleGraphQLHttpServlet.newBuilder(buildSchema( speakerService,  attendeeService,  talkService)).build(),
				"/graphql");
	}

	private static GraphQLSchema buildSchema(SpeakerService speakerService, AttendeeService attendeeService, TalkService talkService){
		return SchemaParser.newParser().file("graphql/schema.graphqls").resolvers(new Query(talkService,speakerService,attendeeService),
				new TalkResolver(speakerService), new Mutation(speakerService)).build().makeExecutableSchema();
	}

}
