import java.util.ArrayList;
import java.util.List;

public class _228SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                add(list, start, nums[i - 1]);
                start = nums[i];
            }
        }
        add(list, start, nums[nums.length - 1]);
        return list;
    }

    private void add(List<String> list, int start, int end) {
        if (start == end) {
            list.add(Integer.toString(start));
        } else {
            list.add(start + "->" + end);
        }
    }

}
