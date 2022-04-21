package com.dev.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private Double amount;
	
	public Invoice(Long id, String name, String location, Double amount) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.amount = amount;
	}
	public Invoice() {
		super();
	}
    
    
}
