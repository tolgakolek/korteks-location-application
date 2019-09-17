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
@Table(name = "rooms")
public class Room {
	@Id
	@Column(name = "room_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "map")
	private String map;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_floor_id")
	private Floor floor;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_room_type_id")
	private RoomType roomType;

	@ManyToMany
	@JoinTable(name = "department_room", joinColumns = @JoinColumn(name = "room_id"), inverseJoinColumns = @JoinColumn(name = "department_id"))
	private Set<Department> departmentRooms;

}
