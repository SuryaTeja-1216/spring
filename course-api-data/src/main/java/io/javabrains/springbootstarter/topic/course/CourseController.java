package io.javabrains.springbootstarter.topic.course;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService service;
	
	@RequestMapping(value="/topics/{topicId}/courses",method=RequestMethod.GET)
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return service.getAllCourses(topicId);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return service.getCourse(id);
	}
	
	@RequestMapping(value="/topics/{topicId}/courses",method = RequestMethod.POST)
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		service.addCourse(course);
	}
	
	@RequestMapping(value="/topics/{topicId}/courses/{id}",method=RequestMethod.PUT)
	public void updateCourse(@PathVariable String id , @RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		service.updateCourse(course);
	}
	@RequestMapping(value="/topics/{topicId}/courses/{id}",method=RequestMethod.DELETE)
	public String deleteCourse(@PathVariable String id) {
		service.deleteCourse(id);
		return "deleted successfully";
	}
}
