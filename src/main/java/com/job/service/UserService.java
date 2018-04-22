package com.job.service;

import com.job.dao.UserRepository;
import com.job.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends BaseService {

    @Autowired
    private UserRepository userRepository;

    //得分 由 level+(levelSelf-levelOther)*2,需考虑

    public void save(User user) {
        initSave(user);
        userRepository.save(user);
    }

    public void saveAll(List<User> userList) {
        userRepository.saveAll(userList);
    }

    public User findById(String id) {
        return userRepository.findById(id).get();
    }
}
