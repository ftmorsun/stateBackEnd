package com.bank.model;
/*
 * Role is a part of User authentication 
 * Users can have USER, ADMIN, MANAGER etc roles to
 * execute on the application. 
 * 
 * Fatma Orsun -Jan 2021
 * */
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long roleId;
	private String name;
	
	@OneToMany(mappedBy="role", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<UserRole> userRoles= new HashSet<>();

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
