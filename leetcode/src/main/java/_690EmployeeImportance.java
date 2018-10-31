import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anton on 2/4/18.
 */


public class _690EmployeeImportance {

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeReference = new HashMap<>();
        for (Employee e : employees) {
            employeeReference.put(e.id, e);
        }
        return getImportance(id, employeeReference);
    }

    private int getImportance(int id, Map<Integer, Employee> employeeReference) {
        Employee e = employeeReference.get(id);
        int importance = e.importance;
        for (int eId : e.subordinates) {
            importance += getImportance(eId, employeeReference);
        }
        return importance;
    }

}

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
