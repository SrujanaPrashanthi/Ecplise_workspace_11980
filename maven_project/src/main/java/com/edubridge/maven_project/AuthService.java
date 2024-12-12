package com.edubridge.maven_project;

public class AuthService {
	String userName = "admin";
	String userPassword = "admin123";
	
	public boolean authenticate(String userName, String UserPassword) {
		if(this.userName.equals(userName)&& this.userPassword.equals(UserPassword)) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
