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
@Table(name = "device_rooms")
public class DeviceRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "device_room_id")
	private long id;
	@Column(name = "location_x")
	private String locationX;
	@Column(name = "location_y")
	private String locationY;

	@Column(name = "device_id")
	private long deviceId;

	@Column(name = "room_id")
	private long roomId;
}
