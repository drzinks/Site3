package com.drzinks.client;

import org.springframework.beans.factory.annotation.Autowired;

import com.drzinks.server.WelcomeController;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class SiteUI extends UI {
	
//	@Autowired
//	private RestClient restClient;
	
	@Autowired
	private WelcomeController welcomeController;
	
	private VerticalLayout layout;
	
	
	@Override
	protected void init(VaadinRequest request) {
		setupLayout();
		addHeader();
		
	}

	
	private void setupLayout() {
		layout = new VerticalLayout(); //alt shift l extr local var
		setContent(layout);
	
	}
	
	private void addHeader() {
//		Label label1 = new Label(welcomeController.returnSth());
//		layout.addComponent(label1);		
		Label label1 = new Label(welcomeController.getSthElse());
		//Label label2 = new Label("restClient.getSthFromServer()");
		layout.addComponent(label1);
	//	layout.addComponent(label2);
	}

}
