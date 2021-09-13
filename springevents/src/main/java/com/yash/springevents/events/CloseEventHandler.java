package com.yash.springevents.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * Close event handler method which implements ApplicationListener interface
 * this interface implements onApplicationEvent() method call
 * @author madhav.machiwal
 *
 */
public class CloseEventHandler implements ApplicationListener<ContextClosedEvent>
{

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ContextClosedEvent Call!!");
	}

}
