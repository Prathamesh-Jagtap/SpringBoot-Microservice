package com.JobMicro.Repo;

import com.JobMicro.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
