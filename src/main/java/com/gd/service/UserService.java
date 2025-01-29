package com.gd.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import com.gd.model.User;
import com.gd.model.UserDTO;
import com.gd.repository.UserRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class UserService {
    @Inject
    UserRepository userRepository;
	private ModelMapper mapper = new ModelMapper();

    public List<UserDTO> listAll() {
		List<UserDTO> listResponse= mapper.map(userRepository.listAll(), new TypeToken<List<User>>(){}.getType());

        return listResponse;
    }

    public void addUser(UserDTO user) {
    	User userPer =new User();
    	userPer.setEmail(user.getEmail());
    	userPer.setName(user.getName());
        userRepository.persist(userPer);
    }
}