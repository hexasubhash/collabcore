package com.collabnet.collabcore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabnet.collabcore.dao.PersonDAO;
import com.collabnet.collabcore.dao.UserProfileDAO;
import com.collabnet.collabcore.model.Person;
import com.collabnet.collabcore.model.UserProfile;
import com.collabnet.collabcore.service.UserProfileService;

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
