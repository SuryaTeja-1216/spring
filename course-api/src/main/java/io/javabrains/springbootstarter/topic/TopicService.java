package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring Framework","Spring Framework Description"),
			new Topic("java","Core Java","Core Java Description"),
			new Topic("javascript","JavaScript","JavaScript Description")
	));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		for(Topic tp:topics) {
			if(tp.getId().equals(id)) {
				return tp;
			}
		}
		return null;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		for(Topic tp:topics) {
			if(tp.getId().equals(id)) {
				tp.setId(topic.getId());
				tp.setName(topic.getName());
				tp.setDescription(topic.getDescription());
			}
		}
		
	}

	public void deleteTopic(String id) {
		int n=0;
		for(Topic tp:topics) {
			if(tp.getId().equals(id)) {
				n++;
			}
		}
		topics.remove(n);
	}
}
