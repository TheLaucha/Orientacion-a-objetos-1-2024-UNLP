package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;
    protected JobScheduler jobScheduler;
    protected IStrategy fifo;
    protected IStrategy lifo;
    protected IStrategy high;
    protected IStrategy most;

    private void initializeJobs() {
        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
        fifo = new JobSchedulerFIFO();
        lifo = new JobSchedulerLIFO();
        high = new JobSchedulerHighestPriority();
        most = new JobSchedulerMostEffort();
    }

    private JobScheduler newFifoScheduler() {
        jobScheduler = new JobScheduler(fifo);
        return jobScheduler;
    }

    private JobScheduler newLifoScheduler() {
        jobScheduler = new JobScheduler(lifo);
        return jobScheduler;
    }

    private JobScheduler newPriorityScheduler() {
        jobScheduler = new JobScheduler(high);
        return jobScheduler;
    }

    private JobScheduler newEffortScheduler() {
        jobScheduler = new JobScheduler(most);
        return jobScheduler;
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test

    void testScheduleFIFO() {
        JobScheduler aScheduler = new JobScheduler(fifo);
        aScheduler.schedule(firstJob);
        assertTrue(aScheduler.getJobs().contains(firstJob));
    }

    @Test
    void testScheduleLIFO() {
        JobScheduler aScheduler = new JobScheduler(lifo);
        aScheduler.schedule(lastJob);
        assertTrue(aScheduler.getJobs().contains(lastJob));
    }

    @Test
    void testScheduleHighestPriority() {
        JobScheduler aScheduler = new JobScheduler(high);
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testScheduleMostEffort() {
        JobScheduler aScheduler = new JobScheduler(most);
        aScheduler.schedule(mostEffortJob);
        assertTrue(aScheduler.getJobs().contains(mostEffortJob));
    }

    @Test
    void testUnschedule() {
        JobScheduler aScheduler = new JobScheduler(fifo);
        this.scheduleJobsIn(aScheduler);
        aScheduler.unschedule(highestPriorityJob);
        assertFalse(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNext() {
        JobScheduler scheduler;

        scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), lastJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 3);
    }
}
