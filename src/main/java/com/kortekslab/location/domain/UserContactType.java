package com.kortekslab.location.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_contect_types")
public class UserContactType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_contact_type_id")
	private long id;

	@Column(name = "name")
	private String name;
}
