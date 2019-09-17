package com.kortekslab.location.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "departments")
public class Department {
	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "other")
	private String other;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_subunit_id")
	private SubUnit subUnit;

	@ManyToMany
	@JoinTable(name = "department_room", joinColumns = @JoinColumn(name = "department_id"), inverseJoinColumns = @JoinColumn(name = "room_id"))
	private Set<Room> departmentRooms;

}
