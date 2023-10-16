package io.javabrains.springbootstarter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import io.javabrains.springbootstarter.topic.Topic;
import io.javabrains.springbootstarter.topic.TopicService;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args); 
//		Topic tp  = new Topic("spring","Spring Framework","Spring Framework Description");
//		System.out.println(tp);
//		TopicService ts= new TopicService();
//		System.out.println(ts.getTopic("java"));
//		List<Topic> topics = new ArrayList<>(Arrays.asList(
//				new Topic("spring","Spring Framework","Spring Framework Description"),
//				new Topic("java","Core Java","Core Java Description"),
//				new Topic("javascript","JavaScript","JavaScript Description")
//		));
//		
//		Scanner sc = new Scanner(System.in);
//		String id=sc.nextLine();
//		int count=0;
//		for(Topic emp:topics) {
//			if(emp.getId().equals(id)) {
//				count++;
//			}
//		}
//		topics.remove(count);
//		System.out.println(topics);
	}

}
