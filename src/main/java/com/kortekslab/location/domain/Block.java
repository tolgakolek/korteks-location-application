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
@Table(name = "blocks")
public class Block {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "block_id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "gps")
	private String gps;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_build_id")
	private Build build;

}
