package com.hellodemo.dropwizard.core;

public class Saying
{
	private final long id;
	private final String content;
	
	public Saying(long id,String content)
	{
		this.id=id;
		this.content=content;
	}
	
	public long getID()
	{
		return id;
	}
	
	public String getContent()
	{
		return content;
	}
}