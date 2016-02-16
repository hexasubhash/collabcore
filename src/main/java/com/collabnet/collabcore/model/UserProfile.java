package com.collab.collabapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 * 
 * @author Subhash Kurni
 *
 */
@Entity
@Table(name = "user_profile")
public class UserProfile {

	@Id
	@Column(name = "userprofile_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userProfileId;

	@Column(name = "full_name", nullable = false, length = 30)
	private String fullName;

	@Column(name = "emp_no", nullable = false)
	private String empNo;

	@Column(name = "password", nullable = false, length = 10)
	private String password;

	@Column(name = "salt", nullable = false, length = 30)
	private String salt;

	@Column(name = "email_id", nullable = false)
	private String emailId;

	@Column(name = "date_birth", nullable = false)
	private Date dateOfBirth;

	@Column(name = "phone_no", nullable = false, length = 10)
	private String phoneNo;

	@Column(name = "date_created", nullable = true)
	private Date created;

	@Column(name = "is_active", nullable = false)
	private boolean isActive;

	@Column(name = "disabled", nullable = false)
	private boolean user_disabled;

	public int getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isUser_disabled() {
		return user_disabled;
	}

	public void setUser_disabled(boolean user_disabled) {
		this.user_disabled = user_disabled;
	}

}
