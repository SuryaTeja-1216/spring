package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository repo;

	public List<Topic> getAllTopics() {
		return (List<Topic>) repo.findAll();
	}

	public Topic getTopic(String id) {
		return repo.findById(id).get();
	}

	public void addTopic(Topic topic) {
		repo.save(topic);

	}

	public void updateTopic(String id, Topic topic) {
		repo.save(topic);

	}

	public void deleteTopic(String id) {
		repo.deleteById(id);
	}
}
