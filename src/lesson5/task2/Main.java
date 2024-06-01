package lesson5.task2;

import java.util.*;

public class Main {

    static List<Employee> employeesList = new ArrayList<>();

    public static void main(String[] args) {

        createEmployeesList();
        sortByAge();
        countITEmployees();
        findMaxSalary();
        findHrEmployeesNames();
        calculateAvgSalary();

    }

    public static void createEmployeesList() {
        employeesList.add(new Employee("Alina", 23, "HR", 70_000));
        employeesList.add(new Employee("Alex", 32, "IT", 110_000));
        employeesList.add(new Employee("Darya", 22, "TechSupport", 60_000));
        employeesList.add(new Employee("Olga", 25, "ProjectManager", 130_000));
        employeesList.add(new Employee("Maria", 33, "HR", 75_000));
        employeesList.add(new Employee("Anya", 27, "HR", 70_000));
        employeesList.add(new Employee("Dmitriy", 24, "IT", 90_000));
        employeesList.add(new Employee("Nikolay", 28, "IT", 100_000));
    }

    public static void sortByAge() {
        List<Employee> sortedList = employeesList.stream()
                .filter(x -> x.getAGE() > 30)
                .sorted(Comparator.comparing(Employee::getAGE))
                .toList();

        System.out.println("Все сотрудники старше 30 лет:" + sortedList);
    }

    public static void countITEmployees() {
        int countItEmployees = (int) employeesList.stream()
                .filter(s -> s.getDEPARTMENT().equals("IT"))
                .count();

        System.out.println("Количество сотрудников отдела IT: " + countItEmployees);
    }

    public static void findMaxSalary() {
        Employee richestEmployee = employeesList.stream()
                .max(Comparator.comparing(Employee::getSALARY))
                .get();

        System.out.println("Сотрудник с самой высокой зарплатой: " + richestEmployee);
    }

    public static void findHrEmployeesNames() {
        List<String> employeesNames = employeesList.stream()
                .filter(s -> s.getDEPARTMENT().equals("HR"))
                .map(Employee::getNAME)
                .sorted(String::compareTo)
                .toList();

        System.out.println("Список имен всех сотрудников, работающих в отделе \"HR\": " + employeesNames);
    }

    public static void calculateAvgSalary() {
        OptionalDouble salary = employeesList.stream()
                .map(Employee::getSALARY)
                .mapToInt(value -> value)
                .average();

        System.out.println("Средняя зарплата всех сотрудников: " + salary.getAsDouble());
    }

}
