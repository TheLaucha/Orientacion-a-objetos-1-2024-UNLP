package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class JobSchedulerLIFO extends JobScheduler{
    @Override
    protected JobDescription selectNextJob() {
        return jobs.get(jobs.size()-1);
    }
}
