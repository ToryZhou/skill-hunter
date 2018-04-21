package com.job.dao;

import com.job.entity.UserSkill;

public interface UserSkillRepository extends BaseRespository<UserSkill, String> {


    Iterable<UserSkill> findByUserId(String userId);

}
