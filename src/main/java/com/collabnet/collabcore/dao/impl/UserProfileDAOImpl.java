package com.collabnet.collabcore.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.collabnet.collabcore.dao.UserProfileDAO;
import com.collabnet.collabcore.model.UserProfile;

@Repository
public class UserProfileDAOImpl implements UserProfileDAO {

	private static final Logger logger = LoggerFactory.getLogger(UserProfileDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUserProfile(UserProfile p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Person saved successfully, Person Details=" + p);
	}

	@Override
	public void updateUserProfile(UserProfile p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Person updated successfully, Person Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserProfile> listUserProfiles() {
		Session session = this.sessionFactory.getCurrentSession();
		List<UserProfile> personsList = session.createQuery("from UserProfile").list();
		for (UserProfile p : personsList) {
			logger.info("Person List::" + p);
		}
		return personsList;
	}

	@Override
	public UserProfile getUserProfileById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		UserProfile p = (UserProfile) session.load(UserProfile.class, new Integer(id));
		logger.info("Person loaded successfully, Person details=" + p);
		return p;
	}

	@Override
	public void removeUserProfile(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		UserProfile p = (UserProfile) session.load(UserProfile.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details=" + p);
	}

	@Override
	public UserProfile getUserProfileByCellNo(String phoneNo) {
		Session session = this.sessionFactory.getCurrentSession();
		String queryString = "from UserProfile where phoneNo = :phoneNo";
		Query query = session.createQuery(queryString);
		query.setString("phoneNo", phoneNo);
		Object queryResult = query.uniqueResult();
		UserProfile userProfile = (UserProfile) queryResult;
		return userProfile;
	}

}
