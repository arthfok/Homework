package lesson5.task2;

import java.util.Objects;

public class Employee {

    private final String NAME;
    private final  int AGE;
    private final  String DEPARTMENT;
    private final int SALARY;

    public Employee(String name, int age, String department, int salary) {
        this.NAME = name;
        this.AGE = age;
        this.DEPARTMENT = department;
        this.SALARY = salary;
    }

    public String getNAME() {
        return NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public int getSALARY() {
        return SALARY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return AGE == employee.AGE && SALARY == employee.SALARY && Objects.equals(NAME, employee.NAME)
                && Objects.equals(DEPARTMENT, employee.DEPARTMENT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, AGE, DEPARTMENT, SALARY);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "NAME='" + NAME + '\'' +
                ", AGE=" + AGE +
                ", DEPARTMENT='" + DEPARTMENT + '\'' +
                ", SALARY=" + SALARY +
                '}';
    }
}
