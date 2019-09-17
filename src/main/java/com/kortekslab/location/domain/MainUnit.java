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
@Table(name = "main_units")
public class MainUnit {

	@Id
	@Column(name = "main_unit_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mainUnitId;

	@Column(name = "name")
	private String name;

}
