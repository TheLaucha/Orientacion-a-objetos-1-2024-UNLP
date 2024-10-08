package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class JobSchedulerFIFO implements IStrategy{


    @Override
    public JobDescription selectNextJob(List<JobDescription> jobs) {
        return jobs.get(0);
    }


}
