package com.yash.springevents.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Start event handler method which implements ApplicationListener interface
 * this interface implements onApplicationEvent() method call
 * @author madhav.machiwal
 *
 */
public class StartEventHandler implements ApplicationListener<ContextStartedEvent>
{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ContextStartedEvent Call!!");
		//	System.out.println(event.getClass());
	}

}
