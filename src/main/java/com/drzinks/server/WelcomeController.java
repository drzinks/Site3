package com.drzinks.server;

import org.springframework.stereotype.Component;

@Component
public class WelcomeController {

	public String getHeaderText(){
		return "Header text from server";
	}
}
