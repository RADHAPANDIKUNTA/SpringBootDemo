package io.javabrains.springbootstarter.topic;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	//getting topic repository instance into here
	@Autowired
	private TopicRepository topicRepository;
	public List<Topic> getAllTopics() {
		//return topics;
		List<Topic>topics=new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	public Optional<Topic> getTopic(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
		
	}
	public void addTopic(Topic topic) {
		
		// TODO Auto-generated method stub
		//topics.add(topic);
		topicRepository.save(topic);
	}
	public void updateTopic(String id,Topic topic) {
		// TODO Auto-generated method stub
		
		topicRepository.save(topic);
	 
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
		
	}
	
}
