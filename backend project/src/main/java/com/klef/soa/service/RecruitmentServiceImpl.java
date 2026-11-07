package com.klef.soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.entity.Recruitment;
import com.klef.soa.repository.RecruitmentRepository;

@Service
public class RecruitmentServiceImpl implements RecruitmentService {

    @Autowired
    private RecruitmentRepository repository;

    @Override
    public Recruitment addRecruitment(Recruitment recruitment) {
        return repository.save(recruitment);
    }

    @Override
    public Recruitment updateRecruitment(Long recruitmentId, Recruitment recruitment) {

        Recruitment existing = repository.findById(recruitmentId).orElse(null);

        if (existing != null) {
            existing.setName(recruitment.getName());
            existing.setType(recruitment.getType());
            existing.setStatus(recruitment.getStatus());
            existing.setLocation(recruitment.getLocation());

            return repository.save(existing);
        }

        return null;
    }

    @Override
    public String deleteRecruitment(Long recruitmentId) {

        if (repository.existsById(recruitmentId)) {
            repository.deleteById(recruitmentId);
            return "Recruitment Deleted Successfully";
        }

        return "Recruitment Not Found";
    }

    @Override
    public List<Recruitment> getAllRecruitments() {
        return repository.findAll();
    }

    @Override
    public Recruitment getRecruitmentById(Long recruitmentId) {
        return repository.findById(recruitmentId).orElse(null);
    }

    @Override
    public List<Recruitment> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Recruitment> findByType(String type) {
        return repository.findByType(type);
    }

}