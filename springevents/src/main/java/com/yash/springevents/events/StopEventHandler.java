package com.yash.springevents.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Stop event handler method which implements ApplicationListener interface
 * this interface implements onApplicationEvent() method call
 * @author madhav.machiwal
 *
 */
public class StopEventHandler implements ApplicationListener<ContextStoppedEvent>
{

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ContextStoppedEvent Call!!");
		
	}

}
