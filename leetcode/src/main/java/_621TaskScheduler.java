import java.util.Arrays;

/**
 * Created by anton on 3/7/17.
 */
public class _621TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[28];
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }
        Arrays.sort(taskCount);
        taskCount = Arrays.copyOfRange(taskCount, getLastZeroIndex(taskCount) + 1, 28);

        int intervalCount = 0;
        int taskCountLength = taskCount.length;
        while (true) {
            int i = 0;
            for (; i < Math.min(n + 1, taskCountLength); i++) {
                if (taskCount[taskCountLength - i - 1] > 0) {
                    taskCount[taskCountLength - i - 1]--;
                } else {
                    break;
                }
            }
            Arrays.sort(taskCount);
            if (taskCount[taskCountLength - 1] == 0) {
                intervalCount += i;
                break;
            } else {
                intervalCount += n + 1;
            }
        }

        return intervalCount;
    }

    public int getLastZeroIndex(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                index = i;
            } else {
                break;
            }
        }
        return index;
    }

}
