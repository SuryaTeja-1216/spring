package io.javabrains.springbootstarter.topic.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repo;

	public List<Course> getAllCourses(String topicId) {
		return repo.findByTopicId(topicId);
	}

	public Course getCourse(String id) {
		return repo.findById(id).get();
	}

	public void addCourse(Course course) {
		repo.save(course);

	}

	public void updateCourse(Course topic) {
		repo.save(topic);

	}

	public void deleteCourse(String id) {
		repo.deleteById(id);
	}
}
