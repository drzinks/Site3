package com.drzinks.client;

import org.springframework.beans.factory.annotation.Autowired;

import com.drzinks.server.WelcomeController;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

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
		addForm();
		addContactList();
		
		
	}

	private void setupLayout() {
		layout = new VerticalLayout(); //alt shift l extr local var
		layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		setContent(layout);
	}
	
	private void addHeader() {
		Label label1 = new Label(welcomeController.getHeaderText());
		label1.addStyleName(ValoTheme.LABEL_H1);
		label1.setSizeUndefined();
		layout.addComponent(label1);
	}
	
	private void addForm(){
		HorizontalLayout formLayout = new HorizontalLayout();
		TextField textField = new TextField();
		Button addButton = new Button("Add");
		formLayout.setSpacing(true);
		formLayout.setWidth("80%");
		formLayout.addComponents(textField,addButton);
		layout.addComponent(formLayout);
		
	}
	
	private void addContactList() {
		// TODO Auto-generated method stub
		
	}

}
