package com.job.entity;


import com.job.enumerate.Constant;
import com.job.enumerate.EntityEnum;
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
@Table(name = Constant.Entity.TABLE_USER, catalog = Constant.Entity.CATALOG_SKILL_HUNBER)
public class User extends BaseEntity {

    private String name;

    @NotBlank
    private String password;
    private String phone;
    private String weChat;

    private Integer level;
    private Integer experience;

}
