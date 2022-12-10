package com.blog.payloads;

import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {

	private int id;
	
	@Column(name ="user_name", nullable = false)
	private String name;
	private String email;
	private String password;
	private String about;

}
