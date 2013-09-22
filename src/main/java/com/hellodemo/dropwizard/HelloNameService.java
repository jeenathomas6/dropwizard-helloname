package com.hellodemo.dropwizard;

import com.hellodemo.dropwizard.config.HelloWorldConfiguration;
import com.hellodemo.dropwizard.resource.HelloWorldResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class HelloNameService extends Service<HelloWorldConfiguration>
{
	public static void main(String[] args) throws Exception
	{
		new HelloNameService().run(args);
	}
	
	@Override
	public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap)
	{
		bootstrap.setName("hello-name");
	}
	
	@Override
	public void run(HelloWorldConfiguration conf, Environment en)
	{
		final String template=conf.getTemplate();
		final String defaultName=conf.getDefaultName();
		en.addResource(new HelloWorldResource(template,defaultName));
	}
}