package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler  {
    private IStrategy strategy;
    protected List<JobDescription> jobs;

    public JobScheduler (IStrategy strategy) {
        this.strategy = strategy;
        this.jobs = new ArrayList<>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public JobDescription next(){
        JobDescription nextJob = strategy.selectNextJob(jobs);
        this.unschedule(nextJob);
        return nextJob;
    }



}
