package com.bank.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpForm {
	@NotBlank
	@Size(min=3, max=50)
	private String firstName;
	
	@NotBlank
	@Size(min=3, max=50)
	private String lastName;
	
	@NotBlank
	@Size(min=3, max=50)
	private String username;
	
	@NotBlank
	@Size(max=60)
	@Email(message="Please provide valid Email Address")
	private String email;
	
	@NotBlank
	private Set<String> role;
	
	@NotBlank
	@Size(min=6, max=40)
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}
	
	
}
