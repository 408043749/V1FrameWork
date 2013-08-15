package com.panlj.system.service.impl;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

import com.panlj.system.service.MenuService;

@Service
@RemotingDestination(channels={"my-amf"},value="menuAction")
public class MenuServiceImpl implements MenuService {

	public String helloWorld(){
		return "hellowWorld";
	}
}
