package com.ctvit.db.services;

import javax.jws.WebService;

@WebService()
public class CXFDemoWSImpl implements CXFDemoWS {

	@Override
	public String sayHello(String foo) {
		// TODO Auto-generated method stub
		return "hello"+foo;
	}

}