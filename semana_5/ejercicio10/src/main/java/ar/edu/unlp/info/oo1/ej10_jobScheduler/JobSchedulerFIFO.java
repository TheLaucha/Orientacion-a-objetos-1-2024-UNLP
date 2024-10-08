package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class JobSchedulerFIFO extends JobScheduler{


    @Override
    protected JobDescription selectNextJob() {
        return jobs.get(0);
    }
}
