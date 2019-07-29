package com.example.login.domain.repository.user;

import com.example.login.domain.model.User;

public interface UserRepository {

	void cureate(String mail_address,String password);
	
	User find(String user_id);
}
