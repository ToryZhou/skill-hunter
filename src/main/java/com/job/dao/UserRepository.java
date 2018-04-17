package com.job.dao;

import com.job.entity.User;

public interface UserRepository extends BaseRespository<User, String> {

    User findByPhone(String phone);

}
