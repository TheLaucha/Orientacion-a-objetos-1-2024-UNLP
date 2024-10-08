package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class JobSchedulerHighestPriority extends JobScheduler{
    @Override
    protected JobDescription selectNextJob() {
        return this.jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
    }
}
