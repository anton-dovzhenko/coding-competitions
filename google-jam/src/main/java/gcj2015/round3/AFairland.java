package gcj2015.round3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by anton on 2/1/17.
 */
public class AFairland {

    public long getEmployeesNumber(int N, long D, int S0, long As, long Cs, long Rs, int M0, long Am, long Cm, long Rm) {
        int[] S = new int[N];
        int[] M = new int[N];
        S[0] = S0;
        M[0] = M0;
        for (int i = 0; i < N - 1 ; i++) {
            S[i + 1] = (int) ((S[i] * As + Cs) % Rs);
            M[i + 1] = (int) ((M[i] * Am + Cm) % Rm);
        }
        for (int i = 0; i < N - 1 ; i++) {
            M[i + 1] %= i + 1;
        }
        M[0] = 0;

        //Calculate reportees for each manager
        List<Employee> employees = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            employees.add(new Employee(i, M[i], S[i]));
        }

        employees.sort((e1, e2) -> {
            return Integer.compare(e2.id, e1.id);
        });
        int[] childCount = new int[N];
        for (int i = 0; i < N; i++) {
            final Employee employee = employees.get(i);
            childCount[employee.parentId] += 1 + childCount[employee.id];
        }
        for (int i = 0; i < N - 1; i++) {
            final Employee employee = employees.get(i);
            employee.childCount = childCount[employee.id];
        }
        List<Employee> sortedEmployees = new ArrayList<>(employees);
        sortedEmployees.sort((e1, e2) -> {
            return Long.compare(e2.salary, e1.salary);
        });

        int minCount = N - 1;
        for (int i = 0; i < N - 1; i++) {
            boolean[] out = new boolean[N];
            int outCount = i;
            long minSalary = sortedEmployees.get(i).salary;
            for (int j = N - 1; j > i; j--) {


                if (sortedEmployees.get(j).salary - sortedEmployees.get(i).salary <= D) {

                }
            }
        }

        return 0;
    }

    private static class Employee {
        final int id;
        final int parentId;
        final long salary;
        int childCount;

        private Employee(int id, int parentId, long salary) {
            this.id = id;
            this.parentId = parentId;
            this.salary = salary;
        }

    }

}
