package sortMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class JavaSortMethod {

    public static void main(String[] args) {

        /*Employee e1=new Employee(1,"kiran","Persistent",20000);
        Employee e2=new Employee(2,"Rohit","GOV",10000);
        Employee e3=new Employee(3,"Rahul","SIRA",24000);
        Employee e4=new Employee(4,"Amol","LTI",25000);
        */
        List<Employee> employeeLIst= Arrays.asList(
                new Employee(1,"kiran","Persistent",20000),
                new Employee(2,"Rohit","GOV",10000),
                new Employee(3,"Rahul","SIRA",24000),
                new Employee(4,"Amol","LTI",25000)
        );

        // To find 2nd highest salary of an employee from a list of employees use stream api to solve.

        employeeLIst.stream().sorted(Comparator.comparing(Employee::getId).reversed()).skip(1).limit(1).forEach(System.out::println);

        // write a program to find the sum of salaries of all the employee using stream api

        Double total=employeeLIst.stream().map(employee -> employee.getSalary()).reduce(0.0,(e1,e2)-> e1+e2);
        System.out.println(total);
    }

}
