package com.job.controller;

import com.job.entity.UserSkill;
import com.job.service.UserSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/user-skill")
@RestController
public class UserSkillController {

    @Autowired
    private UserSkillService userSkillService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        //todo 检查懒加载的数据是否能返回，如果使用jpa的问题就是不需要的数据太多，
        //todo  考虑不使用关系的entity， 或则entity定义为关系，使用时候就在后台使用不会返回前台也是可以的
        Iterable<UserSkill> byUserId = userSkillService.findByUserId("1");
        byUserId.forEach(item -> {
            System.out.println(item.getSkill().getId());
            System.out.printf(item.getUser().getId());
        });
        return ResponseEntity.ok().body("success");
    }

    @PostMapping
    public void save(@RequestBody @Valid UserSkill userSkill) {
        userSkillService.save(userSkill);
    }
}
