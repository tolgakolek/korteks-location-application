package com.kortekslab.location.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "floors")
public class Floor {

	@Id
	@Column(name = "floor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "other")
	private String other;

	@Column(name = "map")
	private String map;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "block_id")
	private Block block;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "build_id")
	private Build build;
}
