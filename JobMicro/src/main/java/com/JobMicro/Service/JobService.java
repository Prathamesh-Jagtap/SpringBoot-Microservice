package com.JobMicro.Service;

import com.JobMicro.Dto.JobDTO;
import com.JobMicro.Entity.Job;

import java.util.List;


public interface JobService {

    List<JobDTO> findAll();
    void createJob(Job job);

    JobDTO getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
