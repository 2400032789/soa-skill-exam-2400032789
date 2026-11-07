package com.klef.soa.dto;

import java.time.LocalDateTime;

public class RecruitmentDTO {

    private Long recruitmentId;
    private String name;
    private String type;
    private String status;
    private String location;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public RecruitmentDTO() {
    }

    public RecruitmentDTO(Long recruitmentId, String name, String type, String status, String location,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.recruitmentId = recruitmentId;
        this.name = name;
        this.type = type;
        this.status = status;
        this.location = location;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(Long recruitmentId) {
        this.recruitmentId = recruitmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}