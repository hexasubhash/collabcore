package com.collab.collabapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collab.collabapi.dao.PersonDAO;
import com.collab.collabapi.dao.UserProfileDAO;
import com.collab.collabapi.model.Person;
import com.collab.collabapi.model.UserProfile;
import com.collab.collabapi.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {
	
	@Autowired
	private UserProfileDAO userProfileDAO;

	@Override
	@Transactional
	public void addUserProfile(UserProfile p) {
		this.userProfileDAO.addUserProfile(p);
	}

	@Override
	@Transactional
	public void updateUserProfile(UserProfile p) {
		this.userProfileDAO.updateUserProfile(p);
	}

	@Override
	@Transactional
	public List<UserProfile> listUserProfiles() {
		return this.userProfileDAO.listUserProfiles();
	}

	@Override
	@Transactional
	public UserProfile getUserProfileById(int id) {
		return this.userProfileDAO.getUserProfileById(id);
	}

	@Override
	@Transactional
	public void removeUserProfile(int id) {
		this.userProfileDAO.removeUserProfile(id);
	}

	
	@Override
	@Transactional
	public UserProfile getUserProfileByCellNo(String cellNo) {
		return this.userProfileDAO.getUserProfileByCellNo(cellNo);
	}	
	
}
