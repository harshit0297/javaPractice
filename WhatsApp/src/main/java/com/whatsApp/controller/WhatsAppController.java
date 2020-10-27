package com.whatsApp.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.whatsApp.entity.WhatsAppUser;
import com.whatsApp.service.WhatsAppService;
import com.whatsApp.service.WhatsAppServiceInterface;

public class WhatsAppController implements WhatsAppControllerInterface{
	public void createProfile()throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name");
		String name=br.readLine();
		
		System.out.println("enter Password");
		String password=br.readLine();
		System.out.println("enter Email");
		String email=br.readLine();
		System.out.println("enter Address");
		String address=br.readLine();
		//we should transfer data from one layer to other layer via entity class object here FacebookUser is entity
		WhatsAppUser f=new WhatsAppUser();
		f.setName(name);
		f.setPassword(password);
		f.setEmail(email);
		f.setAddress(address);
		
		WhatsAppServiceInterface fs=new WhatsAppService();
		int i=fs.createProfile(f);
		
		if(i>0) {
		System.out.println("profile created successfully");
		}
	}

	public void viewProfile() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("profile viewed");
	}

	public void deleteProfile() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("profile deleted");
	}

	public void editProfile() {
		System.out.println("profile edited");
	}

	public void searchProfile() {
		System.out.println("profile searched");
	}

	public void viewallProfile() {
		System.out.println("profile vv");
	}
}
