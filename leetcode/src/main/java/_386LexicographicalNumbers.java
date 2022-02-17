import java.util.ArrayList;
import java.util.List;

public class _386LexicographicalNumbers {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> numbers = new ArrayList<>();
        addNext(0, n, numbers);
        return numbers;
    }

    private void addNext(int x, int n, List<Integer> numbers) {
        if (x > n) {
            return;
        }
        if (x > 0) {
            numbers.add(x);
        }
        for (int i = 0; i < 10; i++) {
            int next = x * 10 + i;
            if (next > 0) {
                addNext(next, n, numbers);
            }
        }
    }

}
