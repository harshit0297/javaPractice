package com.whatsApp.service;

import com.whatsApp.dao.WhatsAppDAO;
import com.whatsApp.dao.WhatsAppDAOInterface;
import com.whatsApp.entity.WhatsAppUser;

public class WhatsAppService implements WhatsAppServiceInterface{

	public int createProfile(WhatsAppUser f) throws Exception {
		WhatsAppDAOInterface fd=new WhatsAppDAO();
		return fd.createProfileDAO(f);
	}

	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}

	public void editProfile() {
		// TODO Auto-generated method stub
		
	}

	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}

	public void viewallProfile() {
		// TODO Auto-generated method stub
		
	}

	public void deleteProfile() {
		// TODO Auto-generated method stub
		
	}

}
