package com.kortekslab.location.domain;

import java.util.Date;

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
@Table(name = "user_logins")
public class UserLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_login_id")
	private int id;

	@Column(name = "login_password")
	private String loginPassword;

	@Column(name = "createdAt")
	private Date createdAt;

	@Column(name = "ip_address")
	private String ipAddress;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_user_id")
	private User user;

}
