package com.login.login.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.login.model.User;
import com.login.login.repository.UserRepository;

@Service("userService")
public class UserService {

	private UserRepository userRepository;
	
    @Autowired
    public UserService(UserRepository userRepository) { 
      this.userRepository = userRepository;
    }
    
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User findByConfirmationToken(String confirmationToken) {
		return userRepository.findByConfirmationToken(confirmationToken);
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

}