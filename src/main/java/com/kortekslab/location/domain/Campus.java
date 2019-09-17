package com.kortekslab.location.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "campuses")
public class Campus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "campus_id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "state")
	private boolean state;

	@ManyToMany
	@JoinTable(name = "campus_sites", joinColumns = @JoinColumn(name = "campus_id"), inverseJoinColumns = @JoinColumn(name = "site_id"))
	private Set<Site> campusSites;

}
