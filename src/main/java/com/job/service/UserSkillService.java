package com.job.service;

import com.job.dao.UserSkillRepository;
import com.job.entity.UserSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSkillService extends BaseService {

    @Autowired
    private UserSkillRepository userSkillRepository;

    public Iterable<UserSkill> findByUserId(String userId){
         return userSkillRepository.findByUserId(userId);
    }

    public void save(UserSkill userSkill) {
        initSave(userSkill);
        userSkillRepository.save(userSkill);
    }
}
