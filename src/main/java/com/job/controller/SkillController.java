package com.job.controller;

import com.job.entity.Skill;
import com.job.entity.User;
import com.job.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/skill")
@RestController
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(skillService.findAll());
    }

    @PostMapping
    public void save(@RequestBody @Valid Skill skill) {
        skillService.save(skill);
    }
}
