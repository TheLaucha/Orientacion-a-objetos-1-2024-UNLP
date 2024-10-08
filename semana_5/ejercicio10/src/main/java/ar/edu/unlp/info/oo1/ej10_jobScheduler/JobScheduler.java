package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {
    protected List<JobDescription> jobs;

    public JobScheduler () {
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
        JobDescription nextJob = this.selectNextJob();
        this.unschedule(nextJob);
        return nextJob;
    }

    abstract protected JobDescription selectNextJob();

}