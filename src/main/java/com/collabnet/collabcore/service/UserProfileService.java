package com.collab.collabapi.service;

import java.util.List;

import com.collab.collabapi.model.UserProfile;

public interface UserProfileService {

	public void addUserProfile(UserProfile p);
	public void updateUserProfile(UserProfile p);
	public List<UserProfile> listUserProfiles();
	public UserProfile getUserProfileById(int id);
	public UserProfile getUserProfileByCellNo(String cellNo);
	public void removeUserProfile(int id);
	
}
