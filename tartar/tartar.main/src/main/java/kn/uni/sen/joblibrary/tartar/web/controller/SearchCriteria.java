package kn.uni.sen.joblibrary.tartar.web.controller;

import javax.validation.constraints.NotBlank;

public class SearchCriteria
{
	@NotBlank(message = "username can't empty!")
	String username;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}
}
