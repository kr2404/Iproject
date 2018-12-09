package com.iproject.iproject.model;

import org.springframework.data.annotation.Id;

public class IslamEvent {

    @Id
    public String id;
	private String name;
	private String description;
//	private String startDate;
//	private String endDate;
	private String address;
//	private String creationDate;
//	private String updatedDate;
//	private EventCategory category;
	
	public IslamEvent(String name, String description, String address) {
		super();
		this.name = name;
		this.description = description;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "IslamEvent [id=" + id + ", name=" + name + ", description=" + description + ", address=" + address
				+ "]";
	}
	
}
