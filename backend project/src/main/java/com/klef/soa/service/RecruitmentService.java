package com.klef.soa.service;

import java.util.List;

import com.klef.soa.entity.Recruitment;

public interface RecruitmentService {

    Recruitment addRecruitment(Recruitment recruitment);

    Recruitment updateRecruitment(Long recruitmentId, Recruitment recruitment);

    String deleteRecruitment(Long recruitmentId);

    List<Recruitment> getAllRecruitments();

    Recruitment getRecruitmentById(Long recruitmentId);

    List<Recruitment> findByName(String name);

    List<Recruitment> findByType(String type);

}