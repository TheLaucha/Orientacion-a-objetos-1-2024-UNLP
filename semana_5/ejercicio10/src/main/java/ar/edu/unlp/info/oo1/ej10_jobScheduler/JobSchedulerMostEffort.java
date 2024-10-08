package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class JobSchedulerMostEffort extends JobScheduler{
    @Override
    protected JobDescription selectNextJob() {
        return jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
    }
}
