package com.whatsApp.service;

import com.whatsApp.entity.WhatsAppUser;

public interface WhatsAppServiceInterface {
	public int createProfile(WhatsAppUser f)throws Exception;
	public void viewProfile();
	public void editProfile();
	public void searchProfile();
	public void viewallProfile();
	public void deleteProfile();
}
