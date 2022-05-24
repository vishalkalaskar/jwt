package com.example.jwt.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse
{
	private String jwtToken;
	
	public JwtResponse(String jwtToken)
	{
		this.jwtToken=jwtToken;
	}

	
	

}
