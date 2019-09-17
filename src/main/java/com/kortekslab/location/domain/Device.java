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
@Table(name = "devices")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "device_id")
	private int device_id;

	@Column(name = "name")
	private String name;

	@Column(name = "properties")
	private String properties;

	@Column(name = "technology")
	private String technology;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_device_type_id")
	private DeviceType deviceType;
}
