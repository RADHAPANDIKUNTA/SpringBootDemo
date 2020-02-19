package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
//byadding this entity anotation jpa knows to create table called topic that tables having 3 colums
public class Topic {
	
	//coulms in table
	//every table should have primay key e should fix the primary key here
	@Id
	//jpa fix the id as a primary key by using this @id annotation
	private String id;
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	private String shortName;
	public Topic(String id, String description, String shortName) {
		super();
		this.id = id;
		this.description = description;
		this.shortName = shortName;
	}
	public Topic()
	{
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
