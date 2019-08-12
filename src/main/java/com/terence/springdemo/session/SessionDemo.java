package com.terence.springdemo.session;

import org.apache.catalina.startup.VersionLoggerListener;

import javax.websocket.Session;

public class SessionDemo {
	Session session ;

	public void printMessage(String message) {
		System.out.println(message);
	}
}
