package com.job.service;

import com.job.dao.SkillRepository;
import com.job.dao.UserRepository;
import com.job.entity.Skill;
import com.job.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService extends BaseService {

    @Autowired
    private SkillRepository skillRepository;

    public Iterable<Skill> findAll(){
         return skillRepository.findAll();
    }

    public void save(Skill skill){
        initSave(skill);
        skillRepository.save(skill);
    }
}
