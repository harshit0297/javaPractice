package com.Instagram.service;

import com.Instagram.dao.InstagramDAO;
import com.Instagram.dao.InstagramDAOInterface;
import com.Instagram.entity.InstagramUser;

public class InstagramService implements InstagramServiceInterface{

	public int createProfile(InstagramUser f) throws Exception {
		InstagramDAOInterface fd=new InstagramDAO();
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
