import java.util.LinkedList;
import java.util.List;

//N.B.: not very efficient approach
public class _282ExpressionAddOperator {

    public List<String> addOperators(String num, int target) {
        List<String> list = new LinkedList<>();
        if (num.isEmpty()) {
            return list;
        }
        LinkedList<Integer> n = new LinkedList<>();
        LinkedList<Character> o = new LinkedList<>();
        addOperators(num, target, 0, null, n, o, list);
        return list;
    }

    private void addOperators(String num, int target, int pos, String number, LinkedList<Integer> n, LinkedList<Character> o, List<String> expressions) {
        if (pos == num.length()) {
            if (inRange(number) && (number.length() == 1 || number.charAt(0) != '0')) {
                n.add(Integer.parseInt(number));
                if (eval(n, o) == target) {
                    expressions.add(toExpression(n, o));
                }
                n.removeLast();
            }
            return;
        }

        if (number == null) {
            addOperators(num, target, pos + 1, num.charAt(pos) + "", n, o, expressions);
        } else {
            if (number.charAt(0) != '0') {
                addOperators(num, target, pos + 1, number + num.charAt(pos), n, o, expressions);
            }

            if (pos < num.length() && inRange(number)) {
                n.add(Integer.parseInt(number));

                o.add('+');
                addOperators(num, target, pos, null, n, o, expressions);
                o.removeLast();

                o.add('-');
                addOperators(num, target, pos, null, n, o, expressions);
                o.removeLast();

                o.add('*');
                addOperators(num, target, pos, null, n, o, expressions);
                o.removeLast();

                n.removeLast();
            }
        }
    }

    private int eval(LinkedList<Integer> n, LinkedList<Character> o) {
        n = (LinkedList<Integer>) n.clone();
        o = (LinkedList<Character>) o.clone();
        int index = 0;
        while (index < o.size()) {
            if (o.get(index) == '*') {
                o.remove(index);
                n.set(index, n.get(index) * n.get(index + 1));
                n.remove(index + 1);
            } else {
                index++;
            }
        }
        int result = n.getFirst();
        for (int i = 0; i < o.size(); i++) {
            int num = n.get(i + 1);
            result += num * (o.get(i) == '-' ? -1 : 1);
        }
        return result;
    }

    private boolean inRange(String n) {
        if (n.length() < 10) {
            return true;
        } else if (n.length() == 10) {
            return Long.parseLong(n) <= Integer.MAX_VALUE;
        } else {
            return false;
        }
    }

    private String toExpression(LinkedList<Integer> n, LinkedList<Character> o) {
        StringBuilder e = new StringBuilder();
        for (int i = 0; i < o.size(); i++) {
            e.append(n.get(i));
            e.append(o.get(i));
        }
        e.append(n.getLast());
        return e.toString();
    }

}