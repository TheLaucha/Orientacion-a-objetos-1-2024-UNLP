package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public interface IStrategy {
    JobDescription selectNextJob(List<JobDescription> jobs);
}