import java.util.*;

/**
 * Created by anton on 24/9/18.
 */
public class _218TheSkylineProblem {

    private static class SL implements Comparable<SL> {
        int index;
        int pos;
        int value;

        public SL(int index, int pos, int value) {
            this.index = index;
            this.pos = pos;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SL SL = (SL) o;
            if (index != SL.index) return false;
            if (value != SL.value) return false;
            return pos == SL.pos;
        }

        @Override
        public int hashCode() {
            int result = index;
            result = 31 * result + value;
            result = 31 * result + pos;
            return result;
        }

        @Override
        public int compareTo(SL o) {
            int c = Integer.compare(pos, o.pos);
            if (c == 0) {
                c = Integer.compare(value, o.value);
            }
            if (c == 0) {
                c = Integer.compare(index, o.index);
            }
            return c;
        }

    }

    public List<int[]> getSkyline(int[][] buildings) {
        LinkedList<int[]> result = new LinkedList<>();
        result.add(new int[] {0, 0});
        PriorityQueue<SL> starts = new PriorityQueue<>();
        PriorityQueue<SL> ends = new PriorityQueue<>();
        for (int i = 0; i < buildings.length; i++) {
            starts.offer(new SL(i, buildings[i][0], buildings[i][2]));
            ends.offer(new SL(i, buildings[i][1], buildings[i][2]));
        }
        Map<Integer, SL> started = new HashMap<>();
        while (!starts.isEmpty() || !ends.isEmpty()) {
            int[] last = result.getLast();
            SL s = starts.peek();
            SL e = ends.peek();
            if (s == null || e != null && s.pos > e.pos) {
                //end is closest
                ends.poll();
                started.remove(e.index);
                if (started.isEmpty()) {
                    addNext(result, last, e.pos, 0);
                } else if (e.value >= last[1]){
                    int max = 0;
                    for (Map.Entry<Integer, SL> entry : started.entrySet()) {
                        max = Math.max(max, entry.getValue().value);
                    }
                    if (max != e.value) {
                        addNext(result, last, e.pos, max);
                    }
                }

            } else {
                //start is closest
                starts.poll();
                if (s.value > last[1]) {
                    addNext(result, last, s.pos, s.value);
                }
                started.put(s.index, s);
            }
        }
        if (result.getFirst()[0] == 0 && result.getFirst()[1] == 0) {
            result.removeFirst();
        }
        return result;
    }

    private void addNext(LinkedList<int[]> result, int[] last, int pos, int val) {
        if (last[0] == pos) {
            last[1] = val;
        } else {
            result.add(new int[]{pos, val});
        }
    }


}
