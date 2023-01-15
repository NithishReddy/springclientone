package com.example.cloudclient.service;

import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
class MyRefreshEventListener implements ApplicationListener<RefreshScopeRefreshedEvent> {

	@Override
	public void onApplicationEvent(RefreshScopeRefreshedEvent event) {
		
		System.out.println("/refresh is called..");
	}

}