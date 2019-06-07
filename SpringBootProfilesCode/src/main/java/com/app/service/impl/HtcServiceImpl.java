package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotifyService;
@Component
@Profile("htc")
public class HtcServiceImpl implements INotifyService {


	public void notificate() {
		// TODO Auto-generated method stub
System.out.println("for htc service only");
	}

}
