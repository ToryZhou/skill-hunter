package com.job.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * Copyright with Patsnap company.
 * Author: Tory
 * Date: 3/15/17
 * Time: 4:42 PM
 */
@Getter
@Setter
@Entity
@Table(name = "user", catalog = "skill_hunter")
public class User extends BaseEntity {

    private String name;

    @NotBlank
    private String password;
    private String phone;
    private String weChat;

}
