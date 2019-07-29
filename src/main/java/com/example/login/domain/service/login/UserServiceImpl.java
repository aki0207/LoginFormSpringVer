package com.example.login.domain.service.login;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.login.domain.model.User;
import com.example.login.domain.repository.user.UserRepository;
import com.github.dozermapper.core.inject.Inject;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
    @Inject
    UserRepository userRepository;

	@Override
	public User create(User user) {
		
		String user_id = UUID.randomUUID().toString();
		user.setUserId(user_id);
		return null;
	}

}
