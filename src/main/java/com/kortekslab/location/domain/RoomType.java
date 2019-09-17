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
@Table(name = "room_types")
public class RoomType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "room_type_id")
	private int id;

	@Column(name = "Name")
	private String name;

}
