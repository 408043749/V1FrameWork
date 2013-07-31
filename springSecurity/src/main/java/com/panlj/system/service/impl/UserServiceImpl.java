package com.panlj.system.service.impl;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

import com.panlj.system.service.UserService;


@Service
@RemotingDestination
public class UserServiceImpl implements UserService{
	public String helloWorld(){
		return "hellow";
	}
}
