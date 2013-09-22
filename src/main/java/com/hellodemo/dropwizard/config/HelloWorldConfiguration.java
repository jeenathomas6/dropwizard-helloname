package com.hellodemo.dropwizard.config;

import com.yammer.dropwizard.config.Configuration;
import com.fasterxml.jackson.annotation.*;
import org.hibernate.validator.constraints.*;

public class HelloWorldConfiguration extends Configuration
{
	@NotEmpty
	@JsonProperty
	private String template;
	
	@NotEmpty
	@JsonProperty
	private String defaultname;
	
	public String getTemplate()
	{
		return template;
	}
	
	public String getDefaultName()
	{
		return defaultname;
	}
	
}