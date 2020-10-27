package com.Instagram.service;

import com.Instagram.entity.InstagramUser;

public interface InstagramServiceInterface {
	public int createProfile(InstagramUser f)throws Exception;
	public void viewProfile();
	public void editProfile();
	public void searchProfile();
	public void viewallProfile();
	public void deleteProfile();
}
