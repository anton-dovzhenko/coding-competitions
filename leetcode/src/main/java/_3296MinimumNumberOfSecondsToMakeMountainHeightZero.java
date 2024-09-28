import java.util.PriorityQueue;

public class _3296MinimumNumberOfSecondsToMakeMountainHeightZero {

    private static final class WorkerGroup implements Comparable<WorkerGroup> {
        long time;
        long increment;
        long iterations;

        public WorkerGroup(long time, long increment, long iterations) {
            this.time = time;
            this.increment = increment;
            this.iterations = iterations;
        }

        public WorkerGroup applyIncrement() {
            this.time = getNextTime();
            this.iterations++;
            return this;
        }

        public long getNextTime() {
            return time + increment * (iterations + 1);
        }

        @Override
        public int compareTo(WorkerGroup o) {
            return Long.compare(getNextTime(), o.getNextTime());
        }
    }

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long seconds = 0;
        PriorityQueue<WorkerGroup> workerQueue= new PriorityQueue<>();
        for (int wt : workerTimes) {
            workerQueue.add(new WorkerGroup(0, wt, 0));
        }
        while (mountainHeight > 0) {
            WorkerGroup wg = workerQueue.poll();
            wg.applyIncrement();
            seconds = Math.max(seconds, wg.time);
            workerQueue.add(wg);
            mountainHeight--;
        }
        return seconds;
    }

}
