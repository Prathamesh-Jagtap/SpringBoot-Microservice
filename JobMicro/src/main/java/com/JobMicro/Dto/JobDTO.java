package com.JobMicro.Dto;

import com.JobMicro.Entity.Job;
import com.JobMicro.external.Company;
import com.JobMicro.external.Review;

import java.util.List;

public class JobDTO {

    private Job job;
    private Company company;
    private List<Review> review;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }
}
