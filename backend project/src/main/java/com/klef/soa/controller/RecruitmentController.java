package com.klef.soa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.entity.Recruitment;
import com.klef.soa.service.RecruitmentService;

@RestController
@RequestMapping("/recruitment")
public class RecruitmentController {

    @Autowired
    private RecruitmentService service;

    @PostMapping("/add")
    public Recruitment addRecruitment(@RequestBody Recruitment recruitment) {
        return service.addRecruitment(recruitment);
    }

    @PutMapping("/update/{id}")
    public Recruitment updateRecruitment(@PathVariable Long id,
            @RequestBody Recruitment recruitment) {
        return service.updateRecruitment(id, recruitment);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRecruitment(@PathVariable Long id) {
        return service.deleteRecruitment(id);
    }

    @GetMapping("/all")
    public List<Recruitment> getAllRecruitments() {
        return service.getAllRecruitments();
    }

    @GetMapping("/{id}")
    public Recruitment getRecruitmentById(@PathVariable Long id) {
        return service.getRecruitmentById(id);
    }

    @GetMapping("/name/{name}")
    public List<Recruitment> findByName(@PathVariable String name) {
        return service.findByName(name);
    }

    @GetMapping("/type/{type}")
    public List<Recruitment> findByType(@PathVariable String type) {
        return service.findByType(type);
    }
}