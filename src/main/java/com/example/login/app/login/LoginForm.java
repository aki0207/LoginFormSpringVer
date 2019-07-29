package com.example.login.app.login;

import java.io.Serializable;

public class LoginForm implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private String mailAddress;
    private String password;
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mail_address) {
		this.mailAddress = mail_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    

}
