package com.job.entity;

import com.job.enumerate.Constant;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = Constant.Entity.TABLE_SKILL, catalog = Constant.Entity.CATALOG_SKILL_HUNBER)
public class Skill extends BaseEntity {
    private String name;
    private String picture;

    private String parentId;
}
