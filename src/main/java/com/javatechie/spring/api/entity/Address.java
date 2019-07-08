package com.javatechie.spring.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "AT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
	@Id
	private int id;
	private String city;
	private String state;
	@OneToOne(mappedBy = "address")
	private Person person;
}
