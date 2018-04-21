package com.job.entity;

import com.job.enumerate.Constant;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = Constant.Entity.TABLE_USER_SKILL, catalog = Constant.Entity.CATALOG_SKILL_HUNBER)
public class UserSkill extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "skill")
    private Skill skill;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "user")
    private User user;

    private Integer level;
}
