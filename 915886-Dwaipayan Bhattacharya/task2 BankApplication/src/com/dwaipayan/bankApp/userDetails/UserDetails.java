package com.dwaipayan.bankApp.userDetails;

public class UserDetails {
    
	    private String firstName;
	    private  String lastName;
	    private  String emailId;
	    private  String phoneNo;
	    private  String dateOfBirth;
	    private  String userName;
	    private  String password;
	    private String AccountNumber;
	    
	    
	    
	    
	    
	    public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAccountNumber() {
		
			this.AccountNumber = this.firstName.substring(0,4)+this.phoneNo.substring(6,10);
			return this.AccountNumber;
		}
	    
	    
}
