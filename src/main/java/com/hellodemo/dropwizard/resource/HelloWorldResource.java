package com.hellodemo.dropwizard.resource;

import com.hellodemo.dropwizard.core.Saying;
import com.google.common.base.Optional;
import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-name")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource
{
	private final String template;
	private final String defaultName;
	private final AtomicLong counter;
	
	public HelloWorldResource(String template,String defaultName)
	{
		this.template=template;
		this.defaultName=defaultName;
		this.counter=new AtomicLong();
	}
	
	@GET
	public Saying sayHello(@QueryParam("name") Optional<String> name)
	{
		return new Saying(counter.getAndIncrement(),String.format(template,name.or(defaultName)));
	}
	
	
}