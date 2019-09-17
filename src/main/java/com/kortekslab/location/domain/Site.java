package com.kortekslab.location.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "sites")
public class Site {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "site_id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "gps")
	private String gps;

	@ManyToMany(mappedBy = "campusSites")
	private Set<Campus> campuses;

}
